package gob.shcp.sireh.test.rules;

import gob.shcp.fsn.test.AbstractServiceLocatorTests;

import org.drools.KnowledgeBase;
import org.drools.KnowledgeBaseFactory;
import org.drools.builder.KnowledgeBuilder;
import org.drools.builder.KnowledgeBuilderError;
import org.drools.builder.KnowledgeBuilderErrors;
import org.drools.builder.KnowledgeBuilderFactory;
import org.drools.builder.ResourceType;
import org.drools.io.impl.ClassPathResource;
import org.drools.runtime.StatefulKnowledgeSession;

public class RulesTest extends AbstractServiceLocatorTests {
    private StatefulKnowledgeSession ksession;

    public RulesTest() {

        KnowledgeBuilder kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();
        kbuilder.add(new ClassPathResource("/META-INF/sireh/resources/drools/rules/DSL/calculoNomina.dsl", getClass()), ResourceType.DSL);
        kbuilder.add(new ClassPathResource("/META-INF/sireh/resources/drools/rules/DSLR/calculoNomina.dslr", getClass()), ResourceType.DSLR);
        KnowledgeBuilderErrors errors = kbuilder.getErrors();
        
        if (errors.size() > 0) {
            for (KnowledgeBuilderError error: errors) {
                System.err.println(error);
            }
            throw new IllegalArgumentException("El archivo de reglas presenta errores.");
        } else {
            System.out.println("El archivo de reglas NO presenta errores.");
        }
        
        KnowledgeBase kbase = KnowledgeBaseFactory.newKnowledgeBase();
        kbase.addKnowledgePackages(kbuilder.getKnowledgePackages());

        ksession = kbase.newStatefulKnowledgeSession();
        //KnowledgeRuntimeLogger logger = KnowledgeRuntimeLoggerFactory.newConsoleLogger(ksession);
    }

    public static void main(String[] args) {
        new RulesTest();
    }
}
