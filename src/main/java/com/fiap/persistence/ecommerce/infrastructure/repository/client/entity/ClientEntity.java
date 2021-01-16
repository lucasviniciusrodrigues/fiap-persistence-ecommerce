package com.fiap.persistence.ecommerce.infrastructure.repository.client.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * Classe que representa o modelo para criação dos clientes.
 * @author Lucas Vinicius
 */

@Data
@Document
public class ClientEntity {

    @Id
    public String document;
    public String name;
    private String birthday;

    @JsonProperty("adress")
    private List<AdressEntity> adressEntities;

}
