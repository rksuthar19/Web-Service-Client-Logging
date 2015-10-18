package com.rksuthar.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;


/**
 * Service Endpoint Interface
 * <p/>
 * Rakesh Kumar Suthar
 */
@WebService
@SOAPBinding(style = Style.RPC)
public interface HelloWorld {

    @WebMethod
    String getHelloWorldAsString(String name);

}