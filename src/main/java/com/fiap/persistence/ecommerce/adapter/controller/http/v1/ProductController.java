package com.fiap.persistence.ecommerce.adapter.controller.http.v1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
@RequestMapping("/product/v1")
public class ProductController {

    private static Logger LOGGER;

    @Autowired
    public ProductController(Logger logger){
        LOGGER = logger.getLogger(ProductController.class.getName());
    }

    @GetMapping(value="/product")
    public Object getRegisteredProduct(){

        LOGGER.info("Getting product");

        return "response";
    }

    @PostMapping(value="/onboarding")
    public Object registerProduct(){

        LOGGER.info("Saving product");

        return "response";
    }
}



