package com.fiap.persistence.ecommerce.adapter.exception.handler;

import com.fiap.persistence.ecommerce.adapter.exception.AddressNotFound;
import com.fiap.persistence.ecommerce.adapter.exception.BadRequestProductNotDeclare;
import com.fiap.persistence.ecommerce.adapter.exception.BadRequestProductQuantityNotDeclare;
import com.fiap.persistence.ecommerce.adapter.exception.NoStockAvaliable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
class GeneralExceptionHandler {

    @ExceptionHandler(value = BadRequestProductNotDeclare.class)
    public ResponseEntity<Object> badRequestProductNotDeclare(BadRequestProductNotDeclare e){
        return new ResponseEntity<Object>("Product not declared", HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(value = BadRequestProductQuantityNotDeclare.class)
    public ResponseEntity<Object> badRequestProductQuantityNotDeclare(BadRequestProductQuantityNotDeclare e){
        return new ResponseEntity<Object>("Quantity not declared", HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(value = NoStockAvaliable.class)
    public ResponseEntity<Object> noStockAvaliable(NoStockAvaliable e){
        return new ResponseEntity<Object>("No stock avaliable for item: " + e.getProductEntity().getName() + " - " + e.getProductEntity().getProductId(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(value = AddressNotFound.class)
    public ResponseEntity<Object> addressNotFound(AddressNotFound e){
        return new ResponseEntity<Object>("Address not found", HttpStatus.NOT_FOUND);
    }



}