package com.employee.employee.Mapping;

import com.employee.employee.Dto.EmployeeDto;
import com.employee.employee.Entity.Employee;

public class EmployeeDtoMapping {

    public static EmployeeDto maptoEmployee(Employee employee){
        return(new EmployeeDto(employee.getEmployeeid(),employee.getEmployeename(),employee.getEmployeeage(),employee.getEmployeelocation(),employee.getPhonenumber()));
    }
    public static Employee maptoDto(EmployeeDto employee){
        return(new Employee(employee.getEmployeeid(),employee.getEmployeename(),employee.getEmployeeage(),employee.getEmployeelocation(),employee.getPhonenumber()));
    }
}
