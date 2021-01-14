package com.fiap.persistence.ecommerce.adapter.controller.http.v1;

import com.fiap.persistence.ecommerce.infrastructure.repository.client.entity.Client;
import com.fiap.persistence.ecommerce.usecase.client.OnboardingClientUsecase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Classe utilizada para controlar o direcionamento das requisções feitas pela aplicação quando utilizada a url /client/v1
 * As requisições feita pela aplicação podem ser:
 * /client - para listar os clientes 
 * /adress/{clientId} - para listar o endereço do clientes através do ID
 * @author Lucas Vinicius, Marcio Campos, Rafael Martins
 */

@RestController
@RequestMapping("/client/v1")
public class ClientController {

    private OnboardingClientUsecase onboardingClientUsecase;

    @Autowired
    public ClientController(OnboardingClientUsecase onboardingClientUsecase){
        this.onboardingClientUsecase = onboardingClientUsecase;
    }

    @GetMapping(value="/client")
    public Object getClient(){


        return "response";
    }

    @GetMapping(value="/adress/{clientId}")
    public Object getClientAdress(){


        return "response";
    }

    @PutMapping(value="/onboarding")
    public Object onboardingClient(
            @RequestBody Client client)
    {

        onboardingClientUsecase.execute(client);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}



