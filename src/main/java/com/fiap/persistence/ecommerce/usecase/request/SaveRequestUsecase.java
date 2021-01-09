package com.fiap.persistence.ecommerce.usecase.request;

import com.fiap.persistence.ecommerce.adapter.exception.BadRequestProductNotDeclare;
import com.fiap.persistence.ecommerce.infrastructure.repository.product.ProductRepository;
import com.fiap.persistence.ecommerce.infrastructure.repository.product.entity.ProductEntity;
import com.fiap.persistence.ecommerce.infrastructure.repository.request.RequestRepository;
import com.fiap.persistence.ecommerce.infrastructure.repository.request.entity.RequestEntity;
import com.fiap.persistence.ecommerce.infrastructure.repository.request.entity.RequestEntityItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SaveRequestUsecase {

    RequestRepository requestRepository;
    ProductRepository productRepository;

    @Autowired
    SaveRequestUsecase(RequestRepository requestRepository,
                       ProductRepository productRepository){
        this.requestRepository = requestRepository;
        this.productRepository = productRepository;
    }

    public RequestEntity execute(RequestEntity requestEntity) throws BadRequestProductNotDeclare {

        List<RequestEntityItem> requestedItens = new ArrayList<RequestEntityItem>();

        for(RequestEntityItem requestEntityItem: requestEntity.getItens()){
            ProductEntity product = getProduct(requestEntityItem);
            requestedItens.add(setProductValues(product, requestEntityItem));
        }

        requestEntity.setItens(requestedItens);
        requestEntity.setAmmount();

        return requestRepository.save(requestEntity);
    }

    private RequestEntityItem setProductValues(ProductEntity product, RequestEntityItem requestEntityItem) {
        requestEntityItem.setName(product.getName());
        requestEntityItem.setProductId(product.getProductId());
        requestEntityItem.setUnitValue(product.getActualUnitValue());

        if(requestEntityItem.getQuantity() < 1)
            requestEntityItem.setQuantity(1);

        return requestEntityItem;

    }

    private ProductEntity getProduct(RequestEntityItem product) throws BadRequestProductNotDeclare {
        if(product.getProductId() != null && !product.getProductId().isEmpty())
            return productRepository.findFirstByProductId(product.getProductId());

        if(product.getName() != null && !product.getName().isEmpty())
            return productRepository.findFirstByName(product.getName());

        throw new BadRequestProductNotDeclare(product);
    }
}
