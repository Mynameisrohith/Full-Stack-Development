package com.customer.product.serviceimpl;

import com.customer.product.entity.product;
import com.customer.product.repository.ProductRepository;
import com.customer.product.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository repository;

    public ProductServiceImpl(ProductRepository repo) {
        this.repository = repo;
    }

    @Override
    public product createProduct(product product) {
        return repository.save(product);
    }

    @Override
    public product getProducById(Long id) {
        return repository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Product not found with id " + id));
    }

    @Override
    public List<product> getAllProducts() {
        return repository.findAll();
    }

    // FULL UPDATE (PUT)
    @Override
    public product updateProduct(product product, Long id) {

        product existingProduct = getProducById(id);

        existingProduct.setProductName(product.getProductName());
        existingProduct.setPrice(product.getPrice());
        existingProduct.setQuantity(product.getQuantity());

        return repository.save(existingProduct);
    }

    // PARTIAL UPDATE (PATCH)
    @Override
    public product updateProductName(Long id, String name) {

        product existingProduct = getProducById(id);
        existingProduct.setProductName(name);

        return repository.save(existingProduct);
    }

    @Override
    public void deleteproductbyid(Long id) {
         repository.deleteById(id);
    }
}
