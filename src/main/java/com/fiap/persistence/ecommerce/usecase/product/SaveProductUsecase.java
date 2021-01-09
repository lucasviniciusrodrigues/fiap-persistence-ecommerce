package com.fiap.persistence.ecommerce.usecase.product;

import com.fiap.persistence.ecommerce.infrastructure.repository.product.ProductRepository;
import com.fiap.persistence.ecommerce.infrastructure.repository.product.entity.ProductEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SaveProductUsecase {

    ProductRepository productRepository;

    @Autowired
    SaveProductUsecase(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    public void execute(ProductEntity product) {
        productRepository.save(product);
    }
}
