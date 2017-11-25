package com.example.dropwizard3.demo;

import org.springframework.stereotype.Service;

/**
 * This service trows an exception that will be caught by {@link DemoExceptionHandler}
 * Created by douglascarvalho on 25/11/2017.
 */
@Service
public class DemoService {

    /**
     * @param request string sent in the request body
     * @throws Exception the exception thrown here will be caught by handler
     */
    public void doSomething(String request) throws Exception {

        if(request != null){
            throw new GreetingException("Hello there!");
        }

        throw new Exception("Send something in the request body!");
    }
}
