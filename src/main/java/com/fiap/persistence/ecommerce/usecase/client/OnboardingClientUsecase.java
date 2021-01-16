package com.fiap.persistence.ecommerce.usecase.client;

import com.fiap.persistence.ecommerce.infrastructure.repository.client.ClientRepository;
import com.fiap.persistence.ecommerce.infrastructure.repository.client.entity.ClientEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.UUID;

/**
 * Classe utilizada para salvar os daods do cliente no banco de dados
 * @author Lucas Vinicius, Marcio Campos, Rafael Martins
 */
@Component
public class OnboardingClientUsecase {

    ClientRepository clientRepository;

    @Autowired
    public OnboardingClientUsecase (ClientRepository clientRepository){
        this.clientRepository = clientRepository;
    }

    public void execute(ClientEntity clientRequest) {
        clientRequest.getAdressEntities().stream().forEach( it -> it.setId(UUID.randomUUID().toString()));
        clientRepository.save(clientRequest);
    }
}
