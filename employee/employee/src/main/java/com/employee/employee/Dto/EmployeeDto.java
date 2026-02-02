package com.employee.employee.Dto;

public class EmployeeDto {
    public EmployeeDto(Integer employeeid, String employeename, String employeeage, String employeelocation, String phonenumber) {
        this.employeeid = employeeid;
        this.employeename = employeename;
        this.employeeage = employeeage;
        this.employeelocation = employeelocation;
        this.phonenumber = phonenumber;
    }

    public Integer getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(Integer employeeid) {
        this.employeeid = employeeid;
    }

    public String getEmployeename() {
        return employeename;
    }

    public void setEmployeename(String employeename) {
        this.employeename = employeename;
    }

    public String getEmployeeage() {
        return employeeage;
    }

    public void setEmployeeage(String employeeage) {
        this.employeeage = employeeage;
    }

    public String getEmployeelocation() {
        return employeelocation;
    }

    public void setEmployeelocation(String employeelocation) {
        this.employeelocation = employeelocation;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    private Integer employeeid;

    private String employeename;

    private String employeeage;

    private String employeelocation;

    private String phonenumber;
}
