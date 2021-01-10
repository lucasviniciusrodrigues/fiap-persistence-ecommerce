package com.fiap.persistence.ecommerce.infrastructure.repository.product;

import com.fiap.persistence.ecommerce.infrastructure.repository.product.entity.ProductEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ProductRepository extends MongoRepository<ProductEntity, String>{

    ProductEntity findFirstByProductId(String productId);

    ProductEntity findFirstByName(String productName);

}