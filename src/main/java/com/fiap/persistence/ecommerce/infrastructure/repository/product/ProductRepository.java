package com.fiap.persistence.ecommerce.infrastructure.repository.product;

import com.fiap.persistence.ecommerce.infrastructure.repository.product.entity.ProductEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<ProductEntity, String>{

    ProductEntity findFirstByProductId(String productId);

    ProductEntity findFirstByName(String productName);
}