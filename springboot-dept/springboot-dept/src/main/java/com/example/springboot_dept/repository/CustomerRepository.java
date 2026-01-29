package com.example.springboot_dept.repository;

import com.example.springboot_dept.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
