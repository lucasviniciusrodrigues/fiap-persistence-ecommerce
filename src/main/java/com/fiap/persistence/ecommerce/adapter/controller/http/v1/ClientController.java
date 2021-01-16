package com.fiap.persistence.ecommerce.adapter.controller.http.v1;

import com.fiap.persistence.ecommerce.infrastructure.repository.client.entity.ClientEntity;
import com.fiap.persistence.ecommerce.usecase.client.GetAdressUsecase;
import com.fiap.persistence.ecommerce.usecase.client.GetClientUsecase;
import com.fiap.persistence.ecommerce.usecase.client.OnboardingClientUsecase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/client/v1")
public class ClientController {

    private OnboardingClientUsecase onboardingClientUsecase;
    private GetClientUsecase getClientUsecase;
    private GetAdressUsecase getAdressUsecase;

    @Autowired
    public ClientController(OnboardingClientUsecase onboardingClientUsecase,
                            GetClientUsecase getClientUsecase,
                            GetAdressUsecase getAdressUsecase){
        this.onboardingClientUsecase = onboardingClientUsecase;
        this.getClientUsecase = getClientUsecase;
        this.getAdressUsecase = getAdressUsecase;
    }

    @GetMapping(value="/client")
    public ResponseEntity<Object> getClient(
            @RequestParam(value = "document") String document)
    {
        return new ResponseEntity<Object>(getClientUsecase.execute(document), HttpStatus.OK);
    }

    @PutMapping(value="/onboarding")
    public ResponseEntity<Object> onboardingClient(
            @RequestBody ClientEntity client)
    {
        onboardingClientUsecase.execute(client);
        return new ResponseEntity<>(client, HttpStatus.CREATED);
    }

    @GetMapping(value="/client/address/{adressId}")
    public ResponseEntity<Object> getAdressById(
            @RequestParam(value = "adressId") String addressId)
    {
        return new ResponseEntity<Object>(getAdressUsecase.execute(addressId), HttpStatus.OK);
    }
}



