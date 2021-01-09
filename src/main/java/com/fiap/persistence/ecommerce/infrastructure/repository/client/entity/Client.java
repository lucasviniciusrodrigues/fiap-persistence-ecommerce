package com.fiap.persistence.ecommerce.infrastructure.repository.client.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document
public class Client {
	
	@Id
    private String id;
    private String name;
    private int age;
    private int individualTaxpayerRegistration;
    private List<Address> address;
    
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getIndividualTaxpayerRegistration() {
		return individualTaxpayerRegistration;
	}
	
	public void setIndividualTaxpayerRegistration(int individualTaxpayerRegistration) {
		this.individualTaxpayerRegistration = individualTaxpayerRegistration;
	}
	
	public List<Address> getAddress() {
		return address;
	}
	
	public void setAddress(List<Address> address) {
		this.address = address;
	}
}
