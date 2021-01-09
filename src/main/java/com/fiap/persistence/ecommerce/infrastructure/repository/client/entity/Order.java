package com.fiap.persistence.ecommerce.infrastructure.repository.client.entity;

import java.util.Date;

import org.springframework.data.annotation.Id;

public class Order {
	@Id
	private String id;
	private Client client;
	private Date date;
	private double amount;
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public Client getClient() {
		return client;
	}
	
	public void setClient(Client client) {
		this.client = client;
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public double getAmount() {
		return amount;
	}
	
	public void setAmount(double amount) {
		this.amount = amount;
	}
}
