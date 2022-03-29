package com.dto;

public enum ProductCat {
    PRODUCT_TYPE("SHAMPOO");
    final String value;
    private ProductCat(String value){
        this.value = value;
    }

    public String getValue(){
        return value;
    }
}
