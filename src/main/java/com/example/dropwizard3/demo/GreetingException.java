package com.example.dropwizard3.demo;

/**
 * Exception thrown when you send a request that is not null into the controller
 * Created by douglascarvalho on 25/11/2017.
 */
public class GreetingException extends Exception {

    public GreetingException(String message) {
        super(message);
    }
}
