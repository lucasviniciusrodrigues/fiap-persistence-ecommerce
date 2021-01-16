package com.fiap.persistence.ecommerce.infrastructure.repository.client.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

/**
 * Classe que representa o modelo para criação dos endereços.
 * @author Lucas Vinicius
 */

@Data
@Document
public class AdressEntity {

	@Id
	private UUID id;
	private String street;
	private String city;
	private String neighborhood;
	private String number;
	private String state;
	private String zipCode;

}
