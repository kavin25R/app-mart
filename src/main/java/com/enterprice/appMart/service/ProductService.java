package com.enterprice.appMart.service;

import com.enterprice.appMart.model.ProductModel;
import com.enterprice.appMart.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository){

        this.productRepository=productRepository;
    }
    public ProductModel saveProduct(ProductModel productModel){

        return productRepository.save(productModel);
    }
    public List<ProductModel> getAllProduct(){

        return productRepository.findAll();
    }
}
