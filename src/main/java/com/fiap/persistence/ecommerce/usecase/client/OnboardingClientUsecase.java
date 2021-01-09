package com.fiap.persistence.ecommerce.usecase.client;

import com.fiap.persistence.ecommerce.infrastructure.repository.client.ClientRepository;
import com.fiap.persistence.ecommerce.infrastructure.repository.client.entity.ClientEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OnboardingClientUsecase {

    ClientRepository clientRepository;

    @Autowired
    public OnboardingClientUsecase (ClientRepository clientRepository){
        this.clientRepository = clientRepository;
    }

    public void execute(ClientEntity clientRequest) {
        clientRepository.save(clientRequest);
    }
}
