package com.fiap.persistence.ecommerce.infrastructure.repository.client.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class AdressEntity {
	
	@Id
	private String addressId;
	private String street;
	private String city;
	private String neighborhood;
	private String number;
	private String state;
	private String zipCode;

}
