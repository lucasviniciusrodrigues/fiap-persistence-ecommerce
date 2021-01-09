package com.fiap.persistence.ecommerce.infrastructure.repository.request.entity;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class RequestEntityItem {

    private String productId;
    private String name;
    private BigDecimal unitValue;
    private int quantity;

}
