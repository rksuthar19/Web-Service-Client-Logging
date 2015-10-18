package com.rksuthar.ws;

import javax.jws.WebService;


/**
 * Service Implementation
 * <p/>
 * Rakesh Kumar Suthar
 */
@WebService(endpointInterface = "com.rksuthar.ws.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    @Override
    public String getHelloWorldAsString(String name) {
        return "Hello World Web Service Implementation for request : " + name;
    }

}