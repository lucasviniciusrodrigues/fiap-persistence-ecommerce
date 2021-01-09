package com.fiap.persistence.ecommerce.infrastructure.repository.client.entity;

import org.springframework.data.annotation.Id;

public class Product {
	@Id
	private String id;
	private String name;
	private int quantity;
	private double unitValue;
	
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
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public double getUnitValue() {
		return unitValue;
	}
	
	public void setUnitValue(double unitValue) {
		this.unitValue = unitValue;
	}
}
