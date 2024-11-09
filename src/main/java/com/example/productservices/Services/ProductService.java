package com.example.productservices.Services;

import com.example.productservices.Models.Products;
import org.springframework.stereotype.Service;

@Service
public interface ProductService {
    public Products getProductDetails(Long id);
}
