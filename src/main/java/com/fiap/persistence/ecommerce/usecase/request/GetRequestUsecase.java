package com.fiap.persistence.ecommerce.usecase.request;

import com.fiap.persistence.ecommerce.infrastructure.repository.request.RequestRepository;
import com.fiap.persistence.ecommerce.infrastructure.repository.request.entity.RequestEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GetRequestUsecase {

    RequestRepository requestRepository;

    @Autowired
    GetRequestUsecase(RequestRepository requestRepository){
        this.requestRepository = requestRepository;
    }

    public RequestEntity getRequestById(String requestId) {
        return requestRepository.findFirstByRequestId(requestId);
    }

    public List<RequestEntity> listRequestByDocument(String document) {
        return requestRepository.findByDocument(document);
    }
}
