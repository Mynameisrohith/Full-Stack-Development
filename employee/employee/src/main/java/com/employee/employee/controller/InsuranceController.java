package com.employee.employee.controller;

import com.employee.employee.Dto.EmployeeDto;
import com.employee.employee.Dto.InsuranceDto;
import com.employee.employee.Entity.Employee;
import com.employee.employee.Entity.Insurance;
import com.employee.employee.Service.EmployeeService;
import com.employee.employee.Service.InsuranceService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class InsuranceController {
    InsuranceService InsuranceService;
    InsuranceController(InsuranceService services){
        this.InsuranceService=services;
    }

    @PostMapping("/createinsurance")
    public ResponseEntity<InsuranceDto> createemployee(@RequestBody Insurance insurance){

        InsuranceDto insurances=InsuranceService.createinsurance(insurance);
        return new ResponseEntity<>(insurances, HttpStatus.CREATED);

    }
    @PutMapping("/updateinsurance/{id}")
    public ResponseEntity<InsuranceDto> updateemployee(@RequestBody Insurance employee,@PathVariable Integer id){

        InsuranceDto insurance=InsuranceService.updateinsurance(employee,id);
        return new ResponseEntity<>(insurance, HttpStatus.OK);

    }
    @GetMapping("/getallinsurances")
    public ResponseEntity<List<InsuranceDto>> getallemployee(){

        List<InsuranceDto> emp=InsuranceService.getallinsurances();
        return new ResponseEntity<>(emp, HttpStatus.OK);

    }
    @GetMapping("/getallinsurances/{id}")
    public ResponseEntity<InsuranceDto> getallemployeebyid(@PathVariable Integer id){

        InsuranceDto emp=InsuranceService.getinsurancebyid(id);

        return new ResponseEntity<>(emp, HttpStatus.OK);

    }

    @DeleteMapping("/deleteinsurancebyid/{id}")
    public ResponseEntity<String> deleteemployeebyid(@PathVariable Integer id){
        InsuranceService.deleteinsurancebyid(id);
        return  new ResponseEntity<>("Deleted record with id "+id+" successfully",HttpStatus.OK);
    }
}
