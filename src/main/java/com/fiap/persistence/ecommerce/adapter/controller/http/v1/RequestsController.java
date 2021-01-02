package com.fiap.persistence.ecommerce.adapter.controller.http.v1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
@RequestMapping("/request/v1")
public class RequestsController {

    private static Logger LOGGER;

    @Autowired
    public RequestsController(Logger logger){
        LOGGER = logger.getLogger(RequestsController.class.getName());
    }

    @GetMapping(value="/request")
    public Object getRegisteredRequest(){

        LOGGER.info("Getting request");

        return "response";
    }

    @PostMapping(value="/onboarding")
    public Object registerRequest(){

        LOGGER.info("Saving request");

        return "response";
    }
}



