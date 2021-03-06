
package org.me.dblp.web;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "dblpImpService", targetNamespace = "http://web.dblp.me.org/", wsdlLocation = "http://localhost:9090/ws/dblp?wsdl")
public class DblpImpService
    extends Service
{

    private final static URL DBLPIMPSERVICE_WSDL_LOCATION;
    private final static WebServiceException DBLPIMPSERVICE_EXCEPTION;
    private final static QName DBLPIMPSERVICE_QNAME = new QName("http://web.dblp.me.org/", "dblpImpService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:9090/ws/dblp?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        DBLPIMPSERVICE_WSDL_LOCATION = url;
        DBLPIMPSERVICE_EXCEPTION = e;
    }

    public DblpImpService() {
        super(__getWsdlLocation(), DBLPIMPSERVICE_QNAME);
    }

    public DblpImpService(WebServiceFeature... features) {
        super(__getWsdlLocation(), DBLPIMPSERVICE_QNAME, features);
    }

    public DblpImpService(URL wsdlLocation) {
        super(wsdlLocation, DBLPIMPSERVICE_QNAME);
    }

    public DblpImpService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, DBLPIMPSERVICE_QNAME, features);
    }

    public DblpImpService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public DblpImpService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Dblp
     */
    @WebEndpoint(name = "dblpImpPort")
    public Dblp getDblpImpPort() {
        return super.getPort(new QName("http://web.dblp.me.org/", "dblpImpPort"), Dblp.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Dblp
     */
    @WebEndpoint(name = "dblpImpPort")
    public Dblp getDblpImpPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://web.dblp.me.org/", "dblpImpPort"), Dblp.class, features);
    }

    private static URL __getWsdlLocation() {
        if (DBLPIMPSERVICE_EXCEPTION!= null) {
            throw DBLPIMPSERVICE_EXCEPTION;
        }
        return DBLPIMPSERVICE_WSDL_LOCATION;
    }

}
