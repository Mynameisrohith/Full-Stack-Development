package com.springproject.crudoperations.serviceimpl;

import com.springproject.crudoperations.Entity.Customer;
import com.springproject.crudoperations.Service.customerservice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class customerserviceimpl implements customerservice {
    @Override


    public Customer createcustomer(Customer customer) {

    }

    @Override
    public List<Customer> getallcustomers() {
        return List.of();
    }

    @Override
    public Customer getcustomerbyid(Integer id) {
        return null;
    }

    @Override
    public Customer updatecustomer(Customer customer, Integer id) {
        return null;
    }
}
