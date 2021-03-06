
package pe.gtdo.soap;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * ABDCP Web service
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6b21 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ABDCPWebService", targetNamespace = "http://ws.inpac.telcordia.com", wsdlLocation = "http://localhost:8080/Portaflow/services/ABDCPWebService?wsdl")
public class ABDCPWebService
    extends Service
{

    private final static URL ABDCPWEBSERVICE_WSDL_LOCATION;
    private final static WebServiceException ABDCPWEBSERVICE_EXCEPTION;
    private final static QName ABDCPWEBSERVICE_QNAME = new QName("http://ws.inpac.telcordia.com", "ABDCPWebService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/Portaflow/services/ABDCPWebService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ABDCPWEBSERVICE_WSDL_LOCATION = url;
        ABDCPWEBSERVICE_EXCEPTION = e;
    }

    public ABDCPWebService() {
        super(__getWsdlLocation(), ABDCPWEBSERVICE_QNAME);
    }

    public ABDCPWebService(WebServiceFeature... features) {
        super(__getWsdlLocation(), ABDCPWEBSERVICE_QNAME, features);
    }

    public ABDCPWebService(URL wsdlLocation) {
        super(wsdlLocation, ABDCPWEBSERVICE_QNAME);
    }

    public ABDCPWebService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ABDCPWEBSERVICE_QNAME, features);
    }

    public ABDCPWebService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ABDCPWebService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ABDCPWebServicePortType
     */
    @WebEndpoint(name = "ABDCPWebServiceHttpSoap12Endpoint")
    public ABDCPWebServicePortType getABDCPWebServiceHttpSoap12Endpoint() {
        return super.getPort(new QName("http://ws.inpac.telcordia.com", "ABDCPWebServiceHttpSoap12Endpoint"), ABDCPWebServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ABDCPWebServicePortType
     */
    @WebEndpoint(name = "ABDCPWebServiceHttpSoap12Endpoint")
    public ABDCPWebServicePortType getABDCPWebServiceHttpSoap12Endpoint(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.inpac.telcordia.com", "ABDCPWebServiceHttpSoap12Endpoint"), ABDCPWebServicePortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ABDCPWEBSERVICE_EXCEPTION!= null) {
            throw ABDCPWEBSERVICE_EXCEPTION;
        }
        return ABDCPWEBSERVICE_WSDL_LOCATION;
    }

}
