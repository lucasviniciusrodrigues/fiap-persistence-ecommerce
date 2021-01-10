package com.fiap.persistence.ecommerce.adapter.exception;

import com.fiap.persistence.ecommerce.infrastructure.repository.product.entity.ProductEntity;

public class NoStockAvaliable extends Exception{

    ProductEntity ProductEntity;

    public com.fiap.persistence.ecommerce.infrastructure.repository.product.entity.ProductEntity getProductEntity() {
        return ProductEntity;
    }

    public NoStockAvaliable(ProductEntity ProductEntity) {
        this.ProductEntity = ProductEntity;
    }
}
