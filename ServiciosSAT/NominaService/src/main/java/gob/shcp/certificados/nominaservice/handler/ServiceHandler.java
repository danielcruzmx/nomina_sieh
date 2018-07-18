package gob.shcp.certificados.nominaservice.handler;

import gob.shcp.certificados.nominaservice.ServiciosWeb;
import gob.shcp.certificados.nominaservice.service.NominaRecepcionService;
import java.io.IOException;
import java.util.Set;
import javax.xml.namespace.QName;
import javax.xml.soap.SOAPConstants;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPHeaderElement;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

/**
 *
 * @author omar_gomez
 */
public class ServiceHandler  implements SOAPHandler<SOAPMessageContext>{
    
    
   @Override
   public boolean handleMessage(SOAPMessageContext context) {
       System.out.println("Client : handleMessage()......");
       
       Boolean isRequest = (Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
       
       //if this is a request, true for outbound messages, false for inbound
	if(isRequest){
            try{
	    SOAPMessage soapMsg = context.getMessage();
            SOAPEnvelope soapEnv = soapMsg.getSOAPPart().getEnvelope();
            SOAPHeader soapHeader = soapEnv.getHeader();

            //if no header, add one
            if (soapHeader == null){
            	soapHeader = soapEnv.addHeader();
            }

            
            

            //add a soap header, name as "Rfc"
            QName qname = new QName("http://tempuri.org/", "Rfc","h");
            //add a soap header, name as "Rfc"
            QName qnameM = new QName("http://schemas.xmlsoap.org/soap/envelope/", "mustUnderstand","s");
            //add a soap header, name as "Rfc"
            QName qnameS = new QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", "Security","o");
            SOAPHeaderElement soapHeaderElement = soapHeader.addHeaderElement(qname);
            //SOAPHeaderElement soapHeaderElementS = soapHeader.addHeaderElement(qnameS);

            
            
            soapHeaderElement.setActor(SOAPConstants.URI_SOAP_ACTOR_NEXT);
            //soapHeaderElementS.setActor(SOAPConstants.URI_SOAP_ACTOR_NEXT);
            //soapHeaderElement.addTextNode("CVA0506151X5");
            soapHeaderElement.addTextNode(ServiciosWeb.getRFC());
            //soapHeaderElementS.addAttribute(qnameM, "1");
            soapMsg.saveChanges();

            //tracking
            soapMsg.writeTo(System.out);

	   }catch(SOAPException e){
		System.err.println(e);
                
	   }catch(IOException e){
		System.err.println(e);
	   }
            catch(Exception ex){
                ex.printStackTrace();
            }
        }



       
       
       //continue other handler chain
	   return true;
   }
    
    
    
    @Override
	public boolean handleFault(SOAPMessageContext context) {
		System.out.println("Client : handleFault()......");
		return true;
	}

	@Override
	public void close(MessageContext context) {
		System.out.println("Client : close()......");
	}

	@Override
	public Set<QName> getHeaders() {
		System.out.println("Client : getHeaders()......");
		return null;
	}
}
