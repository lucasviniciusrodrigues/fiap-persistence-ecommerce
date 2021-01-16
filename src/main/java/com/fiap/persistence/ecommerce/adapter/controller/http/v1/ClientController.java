package com.fiap.persistence.ecommerce.adapter.controller.http.v1;

import com.fiap.persistence.ecommerce.adapter.exception.AddressNotFound;
import com.fiap.persistence.ecommerce.infrastructure.repository.client.entity.ClientEntity;
import com.fiap.persistence.ecommerce.usecase.client.GetAddressUsecase;
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
    private GetAddressUsecase getAddressUsecase;

    @Autowired
    public ClientController(OnboardingClientUsecase onboardingClientUsecase,
                            GetClientUsecase getClientUsecase,
                            GetAddressUsecase getAddressUsecase){
        this.onboardingClientUsecase = onboardingClientUsecase;
        this.getClientUsecase = getClientUsecase;
        this.getAddressUsecase = getAddressUsecase;
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

    @GetMapping(value="/client/address/{addressId}")
    public ResponseEntity<Object> getAddressById(
            @RequestParam(value = "addressId") String addressId,
            @RequestParam(value = "document") String document) throws AddressNotFound {
        return new ResponseEntity<Object>(getAddressUsecase.execute(document, addressId), HttpStatus.OK);
    }
}



