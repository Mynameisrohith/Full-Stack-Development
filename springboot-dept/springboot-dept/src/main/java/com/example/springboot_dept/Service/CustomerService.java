package com.example.springboot_dept.Service;
import com.example.springboot_dept.Entity.Customer;
import com.example.springboot_dept.repository.CustomerRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customers;
    @Transactional
    public void createcustomer(Customer customer){
    customers.save(customer);
    }

    public List<Customer> getallcustomers(){
        return customers.findAll();

    }
    public void updatecustomer(Integer id,Customer newcustomer){
        Customer existing=customers.findById(id).orElseThrow(()->new RuntimeException("requested id not found"+id));
        existing.setCustomername(newcustomer.getCustomername());
        existing.setLocation(newcustomer.getLocation());
        existing.setPhonenumber(newcustomer.getPhonenumber());
        customers.save(existing);
    }

    public void deletecustomer(Integer id){

        customers.deleteById(id);
    }
}
