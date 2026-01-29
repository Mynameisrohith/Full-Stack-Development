package com.customer.customer.ServiceImpl;

import com.customer.customer.Entity.Customer;
import com.customer.customer.Repository.CustomerRepository;
import com.customer.customer.Service.CustomerService;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CustomerServiceImpl implements CustomerService {
    public CustomerServiceImpl(CustomerRepository Repo){
        this.repository=Repo;
    }

    private CustomerRepository repository;
    @Override
    public Customer createCustomers(Customer customer) {

        repository.save(customer);

        return customer;
    }

    @Override

    public Customer updateCustomers(Customer customer, Integer id) {

        Customer existing = repository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Customer not found with id " + id));

        // copy NEW values into EXISTING entity
        existing.setCustomername(customer.getCustomername());
        existing.setLocation(customer.getLocation());
        existing.setPhoenno(customer.getPhoenno());

        // save updated entity
        return repository.save(existing);
    }

    @Override
    public Customer updateCustomerById(Integer id,String name) {
        Customer cust=repository.findById(id).orElseThrow(()->new RuntimeException("customer not found with id "+id));
            cust.setCustomername(name);
        return repository.save(cust);
    }


    @Override
    public List<Customer> getallCustomers() {
        return repository.findAll();
    }

    @Override
    public Customer getCustomerById(Integer id) {
        return repository.findById(id).orElseThrow(()->new RuntimeException("customer not found with id" + id));

    }

    @Override
    public void deletecustomer(Integer id) {
        Customer customer=getCustomerById(id);
            repository.delete(customer);
    }
}
