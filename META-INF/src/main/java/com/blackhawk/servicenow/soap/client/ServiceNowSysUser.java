package com.blackhawk.servicenow.soap.client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.5.1
 * 2014-02-10T12:16:54.979-05:00
 * Generated source version: 2.5.1
 * 
 */
@WebServiceClient(name = "ServiceNow_sys_user", 
                  wsdlLocation = "https://bhndev.service-now.com/sys_user.do?wsdl",
                  targetNamespace = "http://www.service-now.com") 
public class ServiceNowSysUser extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.service-now.com", "ServiceNow_sys_user");
    public final static QName ServiceNowSoap = new QName("http://www.service-now.com", "ServiceNowSoap");
    static {
        URL url = null;
        try {
            url = new URL("https://bhndev.service-now.com/sys_user.do?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ServiceNowSysUser.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "https://bhndev.service-now.com/sys_user.do?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public ServiceNowSysUser(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ServiceNowSysUser(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ServiceNowSysUser() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ServiceNowSysUser(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ServiceNowSysUser(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ServiceNowSysUser(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns ServiceNowSoap
     */
    @WebEndpoint(name = "ServiceNowSoap")
    public ServiceNowSoap getServiceNowSoap() {
        return super.getPort(ServiceNowSoap, ServiceNowSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ServiceNowSoap
     */
    @WebEndpoint(name = "ServiceNowSoap")
    public ServiceNowSoap getServiceNowSoap(WebServiceFeature... features) {
        return super.getPort(ServiceNowSoap, ServiceNowSoap.class, features);
    }

}
