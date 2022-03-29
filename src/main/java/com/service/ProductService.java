package com.service;

import com.dto.Product;

import java.util.List;
import java.util.Map;

public interface ProductService {
    public List<Product> getProduct();
    public List<Product> getProductList(Map<String, String> map);
}
