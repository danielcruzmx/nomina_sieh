package gob.shcp.sireh.service.rule;

import org.drools.event.rule.ActivationCancelledEvent;
import org.drools.event.rule.ActivationCreatedEvent;
import org.drools.event.rule.AgendaGroupPoppedEvent;
import org.drools.event.rule.AgendaGroupPushedEvent;
import org.drools.event.rule.BeforeActivationFiredEvent;
import org.drools.event.rule.AfterActivationFiredEvent;
import org.drools.event.rule.AgendaEventListener;
import org.drools.event.rule.RuleFlowGroupActivatedEvent;
import org.drools.event.rule.RuleFlowGroupDeactivatedEvent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomAgendaEventListener implements AgendaEventListener {
    
    private static Logger log = LoggerFactory.getLogger(CustomAgendaEventListener.class);

    public void afterActivationFired(AfterActivationFiredEvent event) {
        log.info("Rule fired:" + event.getActivation().getRule());
        log.debug("Event: " + event);
    }
    
    public void activationCreated(ActivationCreatedEvent event) {
        log.info(event.toString());
    }

    public void activationCancelled(ActivationCancelledEvent event) {
        log.info(event.toString());
    }

    public void beforeActivationFired(BeforeActivationFiredEvent event) {
        log.info("Rule to fire:" + event.getActivation().getRule());
        log.debug("Event: " + event);
    }

    public void agendaGroupPopped(AgendaGroupPoppedEvent event) {
        log.info(event.toString());
    }

    public void agendaGroupPushed(AgendaGroupPushedEvent event) {
        log.info(event.toString());
    }

    public void beforeRuleFlowGroupActivated(RuleFlowGroupActivatedEvent event) {
        log.info(event.toString());
    }

    public void afterRuleFlowGroupActivated(RuleFlowGroupActivatedEvent event) {
        log.info(event.toString());
    }

    public void beforeRuleFlowGroupDeactivated(RuleFlowGroupDeactivatedEvent event) {
        log.info(event.toString());
    }

    public void afterRuleFlowGroupDeactivated(RuleFlowGroupDeactivatedEvent event) {
        log.info(event.toString());
    }

}
