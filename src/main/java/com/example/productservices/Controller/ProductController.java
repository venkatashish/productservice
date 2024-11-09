package com.example.productservices.Controller;

import com.example.productservices.Models.Products;
import com.example.productservices.Services.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @GetMapping("/products")
    public void getAllProducts(){

    }

    @GetMapping("/products/{id}")
    public Products getProductDetails(@PathVariable("id") Long id){
       return productService.getProductDetails(id);
    }

    public void createProduct(){

    }
}
