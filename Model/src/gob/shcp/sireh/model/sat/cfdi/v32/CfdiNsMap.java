package gob.shcp.sireh.model.sat.cfdi.v32;

import com.sun.xml.bind.marshaller.NamespacePrefixMapper;
//import com.sun.xml.internal.bind.marshaller.NamespacePrefixMapper;

public class CfdiNsMap extends NamespacePrefixMapper {
	private static final String COMPROBANTE_PREFIX = "cfdi";
	private static final String COMPROBANTE_URI = "http://www.sat.gob.mx/cfd/3";
	private static final String NOMINA_PREFIX = "nomina12";
	private static final String NOMINA_URI = "http://www.sat.gob.mx/nomina12";
	//private static final String ADD_PREFIX = "addSre";
        private static final String ADD_PREFIX = "addShcp";
	private static final String ADD_URI = "http://www.sre.gob.mx/sia/nomina/comprobantes";
        
	@Override
	public String getPreferredPrefix(String namespaceUri, String suggestion, boolean requirePrefix) {
		if(COMPROBANTE_URI.equals(namespaceUri)) {
            return COMPROBANTE_PREFIX;
        } else if(NOMINA_URI.equals(namespaceUri)) {
            return NOMINA_PREFIX;
        } else if(ADD_URI.equals(namespaceUri)) {
        	return ADD_PREFIX;
        }
        return suggestion;
	}
}
