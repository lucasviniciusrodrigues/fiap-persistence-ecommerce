package com.fiap.persistence.ecommerce.usecase.product;

import com.fiap.persistence.ecommerce.infrastructure.repository.product.ProductRepository;
import com.fiap.persistence.ecommerce.infrastructure.repository.product.entity.ProductEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GetProductUsecase {

    ProductRepository productRepository;

    @Autowired
    GetProductUsecase(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    public ProductEntity getProductById(String productId) {
        return productRepository.findFirstByProductId(productId);
    }

    public ProductEntity getProductByName(String productName) {
        return productRepository.findFirstByName(productName);
    }

}
