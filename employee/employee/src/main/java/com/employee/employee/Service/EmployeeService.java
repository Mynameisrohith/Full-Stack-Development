package com.employee.employee.Service;

import com.employee.employee.Dto.EmployeeDto;
import com.employee.employee.Entity.Employee;

import java.util.List;

public interface EmployeeService {

    public EmployeeDto createemployee(Employee employee );
    public EmployeeDto updateemployee(Employee employee,Integer id);
    public List<EmployeeDto> getallemployees();
    public EmployeeDto getemployeebyid(Integer id);
    public void deleteemployee(Integer id);
}
