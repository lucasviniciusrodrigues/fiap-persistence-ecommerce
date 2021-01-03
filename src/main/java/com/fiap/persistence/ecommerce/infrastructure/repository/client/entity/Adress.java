package com.fiap.persistence.ecommerce.infrastructure.repository.client.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Adress {
	
	@Id
	private String id;
	private String street;
	private String city;
	private String neighborhood;
	private String number;

}
