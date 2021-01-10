package com.fiap.persistence.ecommerce.adapter.exception;

import com.fiap.persistence.ecommerce.infrastructure.repository.request.entity.RequestEntityItem;

public class BadRequestProductQuantityNotDeclare extends Exception{

    RequestEntityItem  requestEntityItem;

    public BadRequestProductQuantityNotDeclare(RequestEntityItem requestEntityItem) {
        this.requestEntityItem = requestEntityItem;
    }
}
