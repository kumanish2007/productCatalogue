package com.service;

import com.dto.Product;
import com.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.Collections;
import java.util.List;
import java.util.Map;

@Service
public class ProductServiceImpl implements ProductService{
@Autowired
ProductRepository productRepository;

    @Override
    public List<Product> getProduct() {
        return productRepository.findAll();
    }

    @Override
    public List<Product> getProductList(Map<String, String> map) {
        if(!CollectionUtils.isEmpty(map)){
            for(Map.Entry<String, String> entry : map.entrySet()){
                String key = entry.getKey();
                String value = entry.getValue();
                if("SHAMPOO".equals(key) && StringUtils.isEmpty(value)){
                    return productRepository.findByProductType(value);
                }
            }
        }
        return null;
    }
/*
    @Override
    public List<Product> searchProduct(Map<String, String> allRequstParam) {
        if(!CollectionUtils.isEmpty(allRequstParam)){
            for(Entry<String, String> entry : allRequstParam.entrySet()){
                String param = entry.getKey();
                String val = entry.getValue();
                if(ProductCataogue.PRODUCT_TYPE.equalsIgnoreCase(param) && !StringUtils.isEmpty(val)){
                    return productCatalogueRepository.findByProductType(val);
                }
            }
        }
        return null;
    }*/
}
