package com.fiap.persistence.ecommerce.adapter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/onboarding/v1")
public class OnboardingProductController {

    @GetMapping(value="/product")
    public Object registerProduct(){

        return "response";
    }
}



