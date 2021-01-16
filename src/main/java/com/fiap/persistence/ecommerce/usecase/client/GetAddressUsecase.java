package com.fiap.persistence.ecommerce.usecase.client;

import com.fiap.persistence.ecommerce.adapter.exception.AddressNotFound;
import com.fiap.persistence.ecommerce.infrastructure.repository.client.ClientRepository;
import com.fiap.persistence.ecommerce.infrastructure.repository.client.entity.AdressEntity;
import com.fiap.persistence.ecommerce.infrastructure.repository.client.entity.ClientEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.aggregation.ArithmeticOperators;
import org.springframework.stereotype.Component;

@Component
public class GetAddressUsecase {

    ClientRepository clientRepository;

    @Autowired
    public GetAddressUsecase(ClientRepository clientRepository){
        this.clientRepository = clientRepository;
    }

    public AdressEntity execute(String document, String addressId) throws AddressNotFound {

        ClientEntity clientEntity = clientRepository.findFirstByDocument(document);
        for(AdressEntity it : clientEntity.getAdressEntities())
            if(it.equals(addressId))
                return it;

        throw new AddressNotFound();

    }
}
