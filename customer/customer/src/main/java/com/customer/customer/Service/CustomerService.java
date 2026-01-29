package com.customer.customer.Service;

import com.customer.customer.CustomerApplication;
import com.customer.customer.Entity.Customer;


import java.util.List;


public interface CustomerService {


    public Customer createCustomers(Customer customer);
    public Customer updateCustomers(Customer customer,Integer id);
    public Customer updateCustomerById(Integer id,String name);
    public List<Customer> getallCustomers();
    public Customer getCustomerById(Integer id);
    public void deletecustomer(Integer id);
}
