package com.employee.employee.Mapping;

import com.employee.employee.Dto.EmployeeDto;
import com.employee.employee.Dto.InsuranceDto;
import com.employee.employee.Entity.Insurance;

public class InsuranceDtoMapping {

    public static InsuranceDto maptoInsuranceDto(Insurance insurance){
        return new InsuranceDto(insurance.getInsuranceid(),insurance.getInsurancename(),insurance.getInsurancetype(),insurance.getDescription());
    }
    public static Insurance maptoInsurance(InsuranceDto insurance){
        return new Insurance(insurance.getInsuranceid(),insurance.getInsurancename(),insurance.getInsurancetype(),insurance.getDescription());
    }
}
