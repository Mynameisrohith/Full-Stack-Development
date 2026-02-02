package com.employee.employee.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
    public Employee(){

    }
    public Employee(Integer employeeid, String employeename, String employeeage, String employeelocation, String phonenumber) {
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

    @Id
    @Column(name="empid")
    private Integer employeeid;
    @Column(name="empname")
    private String employeename;
    @Column(name="empage")
    private String employeeage;
    @Column(name="emplocation")
    private String employeelocation;
    @Column(name="phoneno")
    private String phonenumber;

}
