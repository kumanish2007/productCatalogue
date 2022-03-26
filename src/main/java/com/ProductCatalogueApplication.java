package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductCatalogueApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductCatalogueApplication.class, args);
		System.out.println("Product Catalogue spring boot application started");
	}

}
