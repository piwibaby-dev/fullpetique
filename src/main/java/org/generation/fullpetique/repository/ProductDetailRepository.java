package org.generation.fullpetique.repository;

import org.generation.fullpetique.models.ProductDetail;
import org.generation.fullpetique.models.ProductDetailCompose;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDetailRepository extends JpaRepository<ProductDetail, ProductDetailCompose> {
}
