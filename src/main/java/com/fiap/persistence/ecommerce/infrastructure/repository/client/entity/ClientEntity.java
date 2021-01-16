package com.fiap.persistence.ecommerce.infrastructure.repository.client.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document
public class ClientEntity {

    @Id
    private String document;
    private String name;
    private String birthday;

    @JsonProperty("adress")
    private List<AdressEntity> adressEntities;

}
