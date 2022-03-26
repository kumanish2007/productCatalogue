package com.service;

import com.dto.Product;
import com.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{
@Autowired
ProductRepository productRepository;

    @Override
    public List<Product> getProduct() {
        return productRepository.findAll();
    }
}
