package com.fiap.persistence.ecommerce.infrastructure.repository.client.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class AdressEntity {

	private String street;
	private String city;
	private String neighborhood;
	private String number;
	private String state;
	private String zipCode;

}
