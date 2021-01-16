package com.fiap.persistence.ecommerce.usecase.client;

import com.fiap.persistence.ecommerce.infrastructure.repository.client.ClientRepository;
import com.fiap.persistence.ecommerce.infrastructure.repository.client.entity.ClientEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GetAdressUsecase {

    ClientRepository clientRepository;

    @Autowired
    public GetAdressUsecase(ClientRepository clientRepository){
        this.clientRepository = clientRepository;
    }

    public ClientEntity execute(String document) {
        return clientRepository.findFirstByDocument(document);
    }
}
