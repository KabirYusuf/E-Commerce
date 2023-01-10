package com.kyaa.ecommerce.data.repositories;

import com.kyaa.ecommerce.data.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Optional<Product> findProductByName(String name);
    Optional<Product>findProductById(Long id);
}
