package com.employee.employee.repository;

import com.employee.employee.Entity.Insurance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InsuranceRepository extends JpaRepository<Insurance,Integer> {
}
