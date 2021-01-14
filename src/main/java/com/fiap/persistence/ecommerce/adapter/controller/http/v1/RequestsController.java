package com.fiap.persistence.ecommerce.adapter.controller.http.v1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Classe utilizada para controlar o direcionamento das requisções feitas pela aplicação quando utilizada a url /request/v1
 *
 * @author Lucas Vinicius, Marcio Campos, Rafael Martins
 */


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



