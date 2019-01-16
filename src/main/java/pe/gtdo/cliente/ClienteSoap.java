package pe.gtdo.cliente;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import javax.enterprise.context.ApplicationScoped;
import javax.xml.namespace.QName;

import pe.gtdo.soap.ABDCPWebServicePortType;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.Service;


@ApplicationScoped
public class ClienteSoap {

	
	public ABDCPWebServicePortType getProxyAbdcp(String wsdl,String targetName ,String servicio , String endPoint ){
	    
		ABDCPWebServicePortType proxy=null;
		QName serviceName = new QName(targetName, endPoint);		
		try {
			URL wsdlURL = new URL(wsdl);				
			Service service = Service.create(wsdlURL, serviceName);	
			proxy = (ABDCPWebServicePortType)service.getPort(ABDCPWebServicePortType.class);
			BindingProvider b=(BindingProvider) proxy;			
			Map<String,Object> map= new HashMap<String,Object>(); 
			map.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,endPoint);
			map.put("javax.xml.ws.client.connectionTimeout", "30000");
			map.put("javax.xml.ws.client.receiveTimeout", "30000");		
			map.putAll(map);
		} catch (MalformedURLException e) {			
			//LOG.info(e.getMessage());
			e.printStackTrace();
		}	

		return proxy;
		
	}
	
	
}
