package com.customer.product.service;

import com.customer.product.entity.product;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ProductService {

    public product createProduct(product product);
    public product getProducById(Long id);
    public List<product> getAllProducts();
    public product updateProduct(product product,Long id);
    public product updateProductName(Long id, String name);
    public void deleteproductbyid(Long id);

}
