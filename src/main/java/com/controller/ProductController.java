package com.controller;

import com.dto.Product;
import com.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @RequestMapping(value = "/productList", method = RequestMethod.GET)
    public List<Product> getListOfProductCatalogue(){
        return productService.getProduct();
    }

    @RequestMapping(value= "/fileteredProduct", method = RequestMethod.GET)
    public List<Product> searchedProductList(@RequestParam Map<String, String> map){
        return productService.getProductList(map);
    }
}
