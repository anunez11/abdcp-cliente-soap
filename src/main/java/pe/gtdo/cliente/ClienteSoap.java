package pe.gtdo.cliente;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;




import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.xml.namespace.QName;

import pe.gtdo.exception.AbdcpException;
import pe.gtdo.soap.ABDCPWebServicePortType;
import pe.gtdo.soap.ReceiveMessageRequest;
import pe.gtdo.soap.ReceiveMessageResponse;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.Service;
import javax.xml.ws.handler.Handler;


@ApplicationScoped
public class ClienteSoap {

	
/*	@Inject
	LoggingClientHandler loogginClient;*/
	
	private String wsdl;
	private String targetName ;
	private String servicio ;
	private String endPoint;
	private String serviceName;
	
	public void setConfig(String wsdl,String targetName ,String serviceName , String endPoint){
		
		this.targetName=targetName;
		this.endPoint=endPoint;
		this.wsdl=wsdl;
		this.serviceName=serviceName;
	}
	
	private ABDCPWebServicePortType getProxyAbdcp() throws AbdcpException{
	    
		
		
		
		ABDCPWebServicePortType proxy=null;
		QName qname = new QName(this.targetName, this.serviceName);		
		try {
					
			URL wsdlURL = new URL(this.wsdl);				
			Service service = Service.create(wsdlURL, qname);	
			proxy = (ABDCPWebServicePortType)service.getPort(ABDCPWebServicePortType.class);
			BindingProvider b=(BindingProvider) proxy;
			
		   java.util.List<Handler> handlers = b.getBinding().getHandlerChain();
		    handlers.add(new LoggingClientHandler());
		    b.getBinding().setHandlerChain(handlers);
			
			Map<String,Object> map= new HashMap<String,Object>(); 
			map.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,this.endPoint);
			map.put("javax.xml.ws.client.connectionTimeout", "30000");
			map.put("javax.xml.ws.client.receiveTimeout", "30000");
					
			
			map.putAll(map);
			b.getRequestContext().putAll(map);
			
			
		} catch (MalformedURLException e) {			
			//LOG.info(e.getMessage());
			throw new AbdcpException(e.getMessage()); 
		}	

		return proxy;
		
	}	
	
	public ReceiveMessageResponse enviarMensaje(byte[] attachedDoc,String password,String userId ,String xmlMsg ) throws AbdcpException{
		
		ABDCPWebServicePortType proxy = getProxyAbdcp();
		ReceiveMessageRequest parameters = new ReceiveMessageRequest();	
		parameters.setAttachedDoc(attachedDoc);
		parameters.setPassword(password);
		parameters.setUserID(userId);
		
		
		System.out.println("====================================================================================");
		System.out.println("USUARIO : "+userId);
		System.out.println("CLAVE : "+password);
		System.out.println("====================================================================================");
		
		parameters.setXmlMsg(xmlMsg);
		return proxy.receiveMessage(parameters);
		
	}	
	
	
}
