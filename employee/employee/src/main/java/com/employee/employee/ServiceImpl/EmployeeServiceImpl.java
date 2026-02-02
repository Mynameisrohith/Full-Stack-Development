package com.employee.employee.ServiceImpl;

import com.employee.employee.Dto.EmployeeDto;
import com.employee.employee.Entity.Employee;
import com.employee.employee.Mapping.EmployeeDtoMapping;
import com.employee.employee.Service.EmployeeService;
import com.employee.employee.exception.ResourceNotFoundException;
import com.employee.employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImpl implements EmployeeService {


    EmployeeRepository repository;
    public EmployeeServiceImpl(EmployeeRepository repo){
        this.repository=repo;
    }

    @Override
    public EmployeeDto createemployee(Employee employee) {
        repository.save(employee);
        return EmployeeDtoMapping.maptoEmployee(employee);
    }

    @Override
    public EmployeeDto updateemployee(Employee employee, Integer id) {
        Employee emp=repository.findById(id).orElseThrow(()-> new ResourceNotFoundException("requested id"+id+"not found!"));
        emp.setEmployeeid(id);
        emp.setEmployeename(employee.getEmployeename());
        emp.setEmployeeage(employee.getEmployeeage());
        emp.setPhonenumber(employee.getPhonenumber());
        emp.setEmployeelocation(employee.getEmployeelocation());
        Employee employees=repository.save(emp);
        return EmployeeDtoMapping.maptoEmployee(employees);
    }

    @Override
    public List<EmployeeDto> getallemployees() {
        return repository.findAll().stream().map((employee->EmployeeDtoMapping.maptoEmployee(employee))).collect(Collectors.toList());

    }

    @Override
    public EmployeeDto getemployeebyid(Integer id) {
        Employee emp=repository.findById(id).orElseThrow(()-> new ResourceNotFoundException("requested id"+id+"not found!"));
        return EmployeeDtoMapping.maptoEmployee(emp);
    }

    @Override
    public void deleteemployee(Integer id) {
        Employee emp=repository.findById(id).orElseThrow(()-> new ResourceNotFoundException("requested id"+id+"not found!"));
        repository.delete(emp);

    }
}
