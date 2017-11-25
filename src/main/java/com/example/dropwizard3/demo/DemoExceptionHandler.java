package com.example.dropwizard3.demo;

import com.codahale.metrics.annotation.Metered;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * This class will catch exceptions thrown by the application
 * Created by douglascarvalho on 25/11/2017.
 */
@ControllerAdvice
public class DemoExceptionHandler {

    @ExceptionHandler( GreetingException.class )
    @Metered( name = "GreetingException" )
    public ResponseEntity<String> handleGreetingException( GreetingException ex ) {

        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_IMPLEMENTED);
    }

    @ExceptionHandler( Exception.class )
    @Metered( name = "Exception" )
    public ResponseEntity<String> handleException( Exception ex ) {

        return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
    }

}
