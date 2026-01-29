package com.springproject.crudoperations.Service;

import com.springproject.crudoperations.Entity.Customer;

import java.util.List;

public interface customerservice {
    Customer createcustomer(Customer customer);
    List<Customer> getallcustomers();
    Customer getcustomerbyid(Integer id);
    Customer updatecustomer(Customer customer, Integer id);
}
