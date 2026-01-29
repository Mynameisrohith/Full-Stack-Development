package com.gentech.demo.Assignment;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class customers {
    private Integer customerid;
    private String customername;
    private String job;
    private Integer salary;

    public customers(){

    }
    public Integer getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Integer customerid) {
        this.customerid = customerid;
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public customers(Integer customerid, String customername, String job, Integer salary) {
        this.customerid = customerid;
        this.customername = customername;
        this.job = job;
        this.salary = salary;
    }
}
