package com.rksuthar.client;

import com.rksuthar.ws.HelloWorld;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Service;
import javax.xml.ws.handler.Handler;
import java.net.URL;
import java.util.List;

/**
 * Rakesh Kumar Suthar
 */
public class ClientApplication {

    public static void main(String[] args) throws Exception {

        URL url = new URL("http://localhost:9990/ws/hello?wsdl");

        //1st argument service URI, refer to wsdl document above
        //2nd argument is service name, refer to wsdl document above
        QName qname = new QName("http://ws.rksuthar.com/", "HelloWorldImplService");

        Service service = Service.create(url, qname);
        HelloWorld hello = service.getPort(HelloWorld.class);

        //Integrating Log Handler
        BindingProvider bindProv = (BindingProvider) hello;
        List<Handler> handlerChain = bindProv.getBinding().getHandlerChain();
        handlerChain.add(new ServiceClientLogHandler());
        bindProv.getBinding().setHandlerChain(handlerChain);

        System.out.println("--------------Calling Web Service--------------");
        System.out.println("Output :" + hello.getHelloWorldAsString("Request String"));

    }

}