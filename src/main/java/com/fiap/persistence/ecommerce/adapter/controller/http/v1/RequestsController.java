package com.fiap.persistence.ecommerce.adapter.controller.http.v1;

import com.fiap.persistence.ecommerce.adapter.exception.BadRequestProductNotDeclare;
import com.fiap.persistence.ecommerce.adapter.exception.NoStockAvaliable;
import com.fiap.persistence.ecommerce.infrastructure.repository.request.entity.RequestEntity;
import com.fiap.persistence.ecommerce.usecase.request.GetRequestUsecase;
import com.fiap.persistence.ecommerce.usecase.request.SaveRequestUsecase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Classe utilizada para controlar o direcionamento das requisções feitas pela aplicação quando utilizada a url /request/v1
 *
 * @author Lucas Vinicius, Marcio Campos, Rafael Martins
 */

@RestController
@RequestMapping("/request/v1")
public class RequestsController {

    private SaveRequestUsecase saveRequestUsecase;
    private GetRequestUsecase getRequestUsecase;

    @Autowired
    public RequestsController(SaveRequestUsecase saveRequestUsecase,
                              GetRequestUsecase getRequestUsecase){
        this.saveRequestUsecase = saveRequestUsecase;
        this.getRequestUsecase = getRequestUsecase;
    }

    @GetMapping(value="/id/{requestId}")
    public ResponseEntity<Object> getRequestById(
            @PathVariable(value = "requestId") String requestId)
    {
        return new ResponseEntity<Object>(getRequestUsecase.getRequestById(requestId), HttpStatus.OK);
    }

    @GetMapping(value="/document/{document}")
    public ResponseEntity<Object> listRequestsByDocument(
            @PathVariable(value = "document") String document)
    {
        return new ResponseEntity<Object>(getRequestUsecase.listRequestByDocument(document), HttpStatus.OK);
    }

    @PutMapping(value="/save")
    public ResponseEntity<Object> saveRequest(
            @RequestBody RequestEntity requestEntity) throws BadRequestProductNotDeclare, NoStockAvaliable {
        return new ResponseEntity<>(saveRequestUsecase.execute(requestEntity), HttpStatus.CREATED);
    }
}



