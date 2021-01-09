package com.fiap.persistence.ecommerce.infrastructure.repository.request.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.List;

@Data
@Document
public class RequestEntity {

    @Id
    private String requestId;
    private String document;
    private BigDecimal amount;
    private String date;
    private List<RequestEntityItem> itens;

    public void setAmmount() {

        amount = BigDecimal.ZERO;

        for(RequestEntityItem item: itens){
            BigDecimal individualItemAmount = item.getUnitValue().multiply(
                    BigDecimal.valueOf(item.getQuantity()));

            amount = amount.add(individualItemAmount);
        }

        setAmount(amount);

    }
}
