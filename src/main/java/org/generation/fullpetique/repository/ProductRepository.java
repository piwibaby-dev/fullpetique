package org.generation.fullpetique.repository;

import org.generation.fullpetique.models.Products;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Products, Long> {
    Optional<Products> findBySku(String sku);
}