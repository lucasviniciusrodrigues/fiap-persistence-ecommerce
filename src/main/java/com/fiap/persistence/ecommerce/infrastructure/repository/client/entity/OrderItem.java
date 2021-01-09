package com.fiap.persistence.ecommerce.infrastructure.repository.client.entity;

import java.util.List;

import org.springframework.data.annotation.Id;

public class OrderItem {
	@Id
	private String id;
	private int quantity;
	private double unitValue;
	private List<Product> product;
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
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
	
	public List<Product> getProduct() {
		return product;
	}
	
	public void setProduct(List<Product> product) {
		this.product = product;
	}
	
	
}
