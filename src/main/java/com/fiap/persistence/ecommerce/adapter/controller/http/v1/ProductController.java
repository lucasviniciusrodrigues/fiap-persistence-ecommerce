package com.fiap.persistence.ecommerce.adapter.controller.http.v1;

import com.fiap.persistence.ecommerce.infrastructure.repository.product.entity.ProductEntity;
import com.fiap.persistence.ecommerce.usecase.product.GetProductUsecase;
import com.fiap.persistence.ecommerce.usecase.product.SaveProductUsecase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Classe utilizada para controlar o direcionamento das requisções feitas pela aplicação quando utilizada a url /product/v1
 * As requisições feita pela aplicação podem ser:
 * /save - para salvar o produto
 * /id/{productId} para buscar o produto pelo id
 * /name/{productName} para buscar o produto pelo nome
 * @author Lucas Vinicius, Marcio Campos, Rafael Martins
 */
@RestController
@RequestMapping("/product/v1")
public class ProductController {

    private SaveProductUsecase saveProductUsecase;
    private GetProductUsecase getProductUsecase;

    @Autowired
    public ProductController(SaveProductUsecase saveProductUsecase,
                             GetProductUsecase getProductUsecase){
        this.saveProductUsecase = saveProductUsecase;
        this.getProductUsecase = getProductUsecase;
    }

    @GetMapping(value="/id/{productId}")
    public ResponseEntity<Object> getProductById(
            @PathVariable(value = "productId") String productId)
    {
        return new ResponseEntity<Object>(getProductUsecase.getProductById(productId), HttpStatus.OK);
    }

    @GetMapping(value="/name/{productName}")
    public ResponseEntity<Object> getProductByName(
            @PathVariable(value = "productName") String productName)
    {
        return new ResponseEntity<Object>(getProductUsecase.getProductByName(productName), HttpStatus.OK);
    }

    @PutMapping(value="/save")
    public ResponseEntity<Object> saveProduct(
            @RequestBody ProductEntity product)
    {
        saveProductUsecase.execute(product);
        return new ResponseEntity<>(product, HttpStatus.CREATED);
    }
}



