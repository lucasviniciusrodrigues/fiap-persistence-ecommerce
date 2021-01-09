package com.fiap.persistence.ecommerce.infrastructure.repository.product.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class ProductEntity {

    private String productId;
    private String name;
    private String quantity;
    private Long actualUnitValue;

}
