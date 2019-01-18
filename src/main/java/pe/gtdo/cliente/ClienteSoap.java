package pe.gtdo.cliente;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import javax.enterprise.context.ApplicationScoped;
import javax.xml.namespace.QName;

import pe.gtdo.exception.AbdcpException;
import pe.gtdo.soap.ABDCPWebServicePortType;
import pe.gtdo.soap.ReceiveMessageRequest;
import pe.gtdo.soap.ReceiveMessageResponse;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.Service;


@ApplicationScoped
public class ClienteSoap {

	
	private String wsdl;
	private String targetName ;
	private String servicio ;
	private String endPoint;
	
	
	public void setConfig(String wsdl,String targetName ,String servicio , String endPoint){
		
		this.targetName=targetName;
		this.endPoint=endPoint;
		this.wsdl=wsdl;
		this.servicio=servicio;
	}
	
	
	
	
	public ABDCPWebServicePortType getProxyAbdcp() throws AbdcpException{
	    
		ABDCPWebServicePortType proxy=null;
		QName serviceName = new QName(this.targetName, this.endPoint);		
		try {
			URL wsdlURL = new URL(this.wsdl);				
			Service service = Service.create(wsdlURL, serviceName);	
			proxy = (ABDCPWebServicePortType)service.getPort(ABDCPWebServicePortType.class);
			BindingProvider b=(BindingProvider) proxy;			
			Map<String,Object> map= new HashMap<String,Object>(); 
			map.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,this.endPoint);
			map.put("javax.xml.ws.client.connectionTimeout", "30000");
			map.put("javax.xml.ws.client.receiveTimeout", "30000");		
			map.putAll(map);
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
		parameters.setXmlMsg(xmlMsg);
		return proxy.receiveMessage(parameters);
		
	}
	
	
	
	
	
	
}
