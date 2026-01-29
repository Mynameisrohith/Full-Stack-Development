package com.customer.customer.controller;

import com.customer.customer.Entity.Customer;
import com.customer.customer.Service.CustomerService;
import com.customer.customer.ServiceImpl.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/customers")
@RestController
public class CustomerController {


    private CustomerService repository;

    public CustomerController(CustomerService repo){
        this.repository=repo;

    }

    @PostMapping("/createcustomer")
    public ResponseEntity<?> createCustomer(@RequestBody Customer customer){
       Customer cust= repository.createCustomers(customer);
        return ResponseEntity.status(HttpStatus.OK).body("Project Created Successfully");
    }
    @PutMapping("/updatecustomer/{id}")
    public ResponseEntity<?> updateCustomer( @PathVariable  Integer id,@RequestBody Customer customer){
        repository.updateCustomers(customer,id);
        return ResponseEntity.status(HttpStatus.OK).body("Updated Successfully");
    }

    @GetMapping("/getallcustomers")
    public ResponseEntity<List<Customer>> getallcustomers( ){
        List<Customer> customer=repository.getallCustomers();
        return ResponseEntity.status(HttpStatus.OK).body(customer);

    }
    @GetMapping("/getallcustomerbyid/{id}")
    public ResponseEntity<Customer> getallcustomerbyid(@PathVariable Integer id){
        Customer customer=repository.getCustomerById(id);
        return ResponseEntity.status(HttpStatus.OK).body(customer);

    }

    @PatchMapping("/updatecustomer/{id}/{name}")
    public ResponseEntity<?> updatecustomerbyid(@PathVariable Integer id, @PathVariable String name){
        repository.updateCustomerById(id,name);
        return ResponseEntity.status(HttpStatus.OK).body("update customer successful");
    }

    @DeleteMapping("/deletecustomer")
    public ResponseEntity<?> deletecustomer(@RequestParam Integer id){
        repository.deletecustomer(id);
        return ResponseEntity.status(HttpStatus.OK).body("customer deleted successfully");
    }

}
