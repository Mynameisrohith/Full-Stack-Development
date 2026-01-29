package com.example.springboot_dept.Controller;

import com.example.springboot_dept.Entity.Customer;
import com.example.springboot_dept.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    CustomerService service;
    @PostMapping("/addcustomer")
    public void setcustomers(@RequestBody Customer customer){
        service.createcustomer(customer);
    }

    @GetMapping("/getallcustomers")
    public List<Customer> getcustomers(){
        return service.getallcustomers();
    }

    @DeleteMapping("/deletecustomer/{id}")
    public void deletecustomer(@PathVariable Integer id){
        service.deletecustomer(id);
    }

    @PutMapping("/updatecustomer/{id}")
    public void updatecustomer(@PathVariable Integer id,@RequestBody Customer customer){
        service.updatecustomer(id,customer);
    }
}
