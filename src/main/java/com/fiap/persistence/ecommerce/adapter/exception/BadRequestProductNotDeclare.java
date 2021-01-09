package com.fiap.persistence.ecommerce.adapter.exception;

import com.fiap.persistence.ecommerce.infrastructure.repository.request.entity.RequestEntityItem;

public class BadRequestProductNotDeclare extends Exception{

    RequestEntityItem  requestEntityItem;

    public BadRequestProductNotDeclare(RequestEntityItem requestEntityItem) {
        this.requestEntityItem = requestEntityItem;
    }
}
