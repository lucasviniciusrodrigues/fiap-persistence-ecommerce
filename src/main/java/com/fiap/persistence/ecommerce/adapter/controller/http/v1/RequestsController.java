package com.fiap.persistence.ecommerce.adapter.controller.http.v1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/request/v1")
public class RequestsController {

    @GetMapping(value="/request")
    public Object getRegisteredRequest(){

        return "response";
    }

    @PutMapping(value="/save")
    public Object registerRequest(){

        return "response";
    }
}



