package com.fiap.persistence.ecommerce.infrastructure.repository.client.entity;

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
public class Client {
	
	@Id
    private String id;
    private String nome;
    private int idade;
    private List<Adress> adress;

}
