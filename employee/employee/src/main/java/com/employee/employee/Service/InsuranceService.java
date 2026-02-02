package com.employee.employee.Service;

import com.employee.employee.Dto.EmployeeDto;
import com.employee.employee.Dto.InsuranceDto;
import com.employee.employee.Entity.Employee;
import com.employee.employee.Entity.Insurance;
import org.springframework.stereotype.Service;

import java.util.List;


public interface InsuranceService {

    public InsuranceDto createinsurance(Insurance insurance);
    public InsuranceDto updateinsurance(Insurance insurance,Integer id);
    public List<InsuranceDto> getallinsurances();
    public InsuranceDto getinsurancebyid(Integer id);
    public void deleteinsurancebyid(Integer id);
}
