package com.fiap.persistence.ecommerce.adapter.controller.http.v1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/product/v1")
public class ProductController {

    @GetMapping(value="/product")
    public Object getRegisteredProduct(){


        return "response";
    }

    @PutMapping(value="/save")
    public Object registerProduct(){


        return "response";
    }
}



