package com.example.dropwizard3.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * This controller simply calls a method from {@link DemoService}
 * Created by douglascarvalho on 25/11/2017.
 */
@Controller
public class DemoController {

    private final DemoService DEMO_SERVICE;


    public DemoController(DemoService demoService) {

        this.DEMO_SERVICE = demoService;
    }

   @RequestMapping("demo")
   public ResponseEntity demo(RequestEntity<String> requestEntity) throws Exception {

        DEMO_SERVICE.doSomething(requestEntity.getBody());

        return new ResponseEntity(HttpStatus.OK);
   }
}
