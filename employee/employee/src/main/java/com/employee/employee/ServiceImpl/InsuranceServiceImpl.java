package com.employee.employee.ServiceImpl;

import com.employee.employee.Dto.EmployeeDto;
import com.employee.employee.Dto.InsuranceDto;
import com.employee.employee.Entity.Employee;
import com.employee.employee.Entity.Insurance;
import com.employee.employee.Mapping.EmployeeDtoMapping;
import com.employee.employee.Mapping.InsuranceDtoMapping;
import com.employee.employee.Service.InsuranceService;
import com.employee.employee.exception.ResourceNotFoundException;
import com.employee.employee.repository.EmployeeRepository;
import com.employee.employee.repository.InsuranceRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class InsuranceServiceImpl implements InsuranceService {
    InsuranceRepository repository;
    public InsuranceServiceImpl(InsuranceRepository repo){
        this.repository=repo;
    }

    @Override
    public InsuranceDto createinsurance(Insurance insurance) {
        repository.save(insurance);
        return InsuranceDtoMapping.maptoInsuranceDto(insurance);
    }

    @Override
    public InsuranceDto updateinsurance(Insurance insure, Integer id) {
        Insurance insurance=repository.findById(id).orElseThrow(()-> new ResourceNotFoundException("requested id"+id+"not found!"));
        insurance.setInsuranceid(id);
        insurance.setInsurancename(insure.getInsurancename());
        insurance.setInsurancetype(insure.getInsurancetype());
        insurance.setDescription(insure.getDescription());

        Insurance insurnaces=repository.save(insurance);
        return InsuranceDtoMapping.maptoInsuranceDto(insurnaces);
    }

    @Override
    public List<InsuranceDto> getallinsurances() {
        List<InsuranceDto> collect = repository.findAll().stream().map(insurance -> InsuranceDtoMapping.maptoInsuranceDto(insurance)).collect(Collectors.toList());
        return collect;

    }

    @Override
    public InsuranceDto getinsurancebyid(Integer id) {
        Insurance insurance=repository.findById(id).orElseThrow(()-> new ResourceNotFoundException("requested id"+id+"not found!"));
        return InsuranceDtoMapping.maptoInsuranceDto(insurance);
    }

    @Override
    public void deleteinsurancebyid(Integer id) {
        Insurance insurance=repository.findById(id).orElseThrow(()-> new ResourceNotFoundException("requested id"+id+"not found!"));
        repository.delete(insurance);

    }
}
