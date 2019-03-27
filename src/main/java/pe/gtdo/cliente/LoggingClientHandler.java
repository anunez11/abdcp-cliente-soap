package pe.gtdo.cliente;

import java.io.ByteArrayOutputStream;
import java.util.Set;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.xml.namespace.QName;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

import pe.gtdo.core.logging.AbdcpLogger;


@Stateless
public class LoggingClientHandler  implements SOAPHandler<SOAPMessageContext> {
	 
	
	/* @Inject
	 AbdcpLogger LOG;*/
	
	 @Override
	 public Set<QName> getHeaders() {
	 return null;
	 }
	 
	 @Override
	 public void close(MessageContext context) {
	 }
	 
	 @Override
	 public boolean handleFault(SOAPMessageContext context) {
	  logToSystemOut(context);
	  return true;
	 }
	 
	 @Override
	 public boolean handleMessage(SOAPMessageContext context) {
	 logToSystemOut(context);
	  return true;
	 }
	 
	 private void logToSystemOut(SOAPMessageContext context) {
		 
		 Boolean esSalida = (Boolean) context
					.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			try {
				
				//baos.toString("UTF-8");
				SOAPMessage soapMessage = context.getMessage();
				soapMessage.setProperty(SOAPMessage.CHARACTER_SET_ENCODING, "UTF-8");
				soapMessage.setProperty(SOAPMessage.WRITE_XML_DECLARATION, "true");
				soapMessage.writeTo(baos);
				String a= esSalida ? "OUT" : "IN";
				String t= esSalida ? "ENVIO" : "RESPUESTA";
				
			//	System.out.println(" ==========================   ");
				System.out.println(" "+t);
				System.out.println(" ==========================   ");				
				//System.out.println(" ==========================   ");
				System.out.println(a+" : "+baos.toString());
				System.out.println(" ========================== ");
				
				//LOG.info("{}=[{}]", esSalida ? "OUT" : "IN",baos.toString());
				
			} catch (Exception ex) {
				System.out.println(" Exception Handler  "+ex);
			}			

	  }

	

}
