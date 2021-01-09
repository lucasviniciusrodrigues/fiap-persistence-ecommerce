package com.fiap.persistence.ecommerce.infrastructure.repository.request;

import com.fiap.persistence.ecommerce.infrastructure.repository.request.entity.RequestEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface RequestRepository extends MongoRepository<RequestEntity, String>{

    RequestEntity findFirstByRequestId(String productId);

    List<RequestEntity> findByDocument(String productName);
}