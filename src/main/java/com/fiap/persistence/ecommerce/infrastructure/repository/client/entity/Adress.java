package com.fiap.persistence.ecommerce.infrastructure.repository.client.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

/**
 * Classe que representa o modelo para criação dos endereços.
 * @author Lucas Vinicius
 *  */

@Data
public class Adress {
	
	@Id
	private String id;
	private String street;
	private String city;
	private String neighborhood;
	private String number;

}
