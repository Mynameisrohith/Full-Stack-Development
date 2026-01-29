package com.customer.product.controller;

import com.customer.product.entity.product;
import com.customer.product.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")

public class ProductController {
    private final ProductService service;
    ProductController(ProductService service){
        this.service=service;
    }


    @PostMapping("/createproduct")
    public ResponseEntity<?> createproduct(@RequestBody product product){
        service.createProduct(product);
        return ResponseEntity.status(HttpStatus.OK).body("product created successfully");

    }
    @PutMapping("/updateproduct/{id}")
    public ResponseEntity<?> updateproduct(@RequestBody product product, @RequestParam Long id){
        service.updateProduct(product,id);
        return ResponseEntity.status(HttpStatus.OK).body("product updated successfully");

    }
    @PatchMapping("/updateproduct/{id}/{name}")
    public ResponseEntity<?> updateproductname(@PathVariable Long id, @PathVariable String name){
        service.updateProductName(id,name);
        return ResponseEntity.status(HttpStatus.OK).body("product name updated successfully");

    }
    @GetMapping("/getallproducts")
    public ResponseEntity<List<product>> getallproducts(){
        List<product> list=service.getAllProducts();
        return ResponseEntity.status(HttpStatus.OK).body(list);

    }

    @GetMapping("/getallproducts/{id}")
    public ResponseEntity<product> getallproductbyid(@PathVariable Long id){
        product list=service.getProducById(id);
        return ResponseEntity.status(HttpStatus.OK).body(list);

    }

    @DeleteMapping("/deleteproductbyid/{id}")
    public ResponseEntity<?> deletebyid(@PathVariable Long id){
        service.deleteproductbyid(id);
        return ResponseEntity.status(HttpStatus.OK).body("product deleted succesfully");
    }
}
