package com.repository;

import com.dto.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query("Select products from Product products where products.productType = :productType")
    public List<Product> findByProductType(@Param("productType") String abc);
}
