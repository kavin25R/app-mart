package com.enterprice.appMart.controler;

import com.enterprice.appMart.model.ProductModel;
import com.enterprice.appMart.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductControler {
    private ProductService productService;

    public ProductControler(ProductService productService){
        this.productService=productService;
    }
    @PostMapping("/insert")
    public ProductModel createProduct(@RequestBody ProductModel productModel){
        return productService.saveProduct(productModel);
    }
    @GetMapping("/view")
    public List<ProductModel> getAllProduct(){
        return productService.getAllProduct();
    }
}
