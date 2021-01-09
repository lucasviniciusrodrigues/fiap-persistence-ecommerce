package com.fiap.persistence.ecommerce.infrastructure.repository.client;

import com.fiap.persistence.ecommerce.infrastructure.repository.client.entity.ClientEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClientRepository extends MongoRepository<ClientEntity, String>{

    public ClientEntity findFirstByDocument(String document);

}