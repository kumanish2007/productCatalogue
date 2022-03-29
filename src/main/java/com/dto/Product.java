package com.dto;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "product")
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "productId")
    private Long id;

    @Column(name = "prodName")
    private String name;

    @Column(name = "price")
    private Long price;

    @Column(name = "productType")
    private String productType;
}
