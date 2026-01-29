package com.customer.product.repository;

import com.customer.product.entity.product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<product,Long> {
}
