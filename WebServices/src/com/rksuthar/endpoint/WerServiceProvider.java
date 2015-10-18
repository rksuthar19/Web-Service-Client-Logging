package com.rksuthar.endpoint;

import com.rksuthar.ws.HelloWorldImpl;

import javax.xml.ws.Endpoint;

/**
 * Endpoint publisher
 * <p/>
 * Rakesh Kumar Suthar
 */
public class WerServiceProvider {

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:9990/ws/hello", new HelloWorldImpl());
        System.out.println("Service Deployed Successfully");
    }

}