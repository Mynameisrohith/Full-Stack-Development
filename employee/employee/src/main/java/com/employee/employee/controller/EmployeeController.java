package com.employee.employee.controller;
import com.employee.employee.Dto.EmployeeDto;
import com.employee.employee.Entity.Employee;
import com.employee.employee.Mapping.EmployeeDtoMapping;
import com.employee.employee.Service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/app/v1")
public class EmployeeController {

    EmployeeService employeeService;
    EmployeeController(EmployeeService service){
        this.employeeService=service;
    }

    @PostMapping("/createemployee")
    public ResponseEntity<EmployeeDto> createemployee(@RequestBody Employee employee){

        EmployeeDto emp=employeeService.createemployee(employee);
        return new ResponseEntity<>(emp, HttpStatus.CREATED);

    }
    @PutMapping("/updateemployee/{id}")
    public ResponseEntity<EmployeeDto> updateemployee(@RequestBody Employee employee,@PathVariable Integer id){

        EmployeeDto emp=employeeService.updateemployee(employee,id);
        return new ResponseEntity<>(emp, HttpStatus.OK);

    }
    @GetMapping("/getallemployees")
    public ResponseEntity<List<EmployeeDto>> getallemployee(){

        List<EmployeeDto> emp=employeeService.getallemployees();
        return new ResponseEntity<>(emp, HttpStatus.OK);

    }
    @GetMapping("/getallemployees/{id}")
    public ResponseEntity<EmployeeDto> getallemployeebyid(@PathVariable Integer id){

        EmployeeDto emp=employeeService.getemployeebyid(id);
        return new ResponseEntity<>(emp, HttpStatus.OK);

    }

    @DeleteMapping("/deleteemployee/{id}")
    public ResponseEntity<String> deleteemployeebyid(@PathVariable Integer id){
        employeeService.deleteemployee(id);
        return  new ResponseEntity<>("Deleted record with id "+id+" successfully",HttpStatus.OK);
    }
}


