package com.gentech.demo.Assignment;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Department {
    private Integer Deptid;
    private String Deptname;
    private Integer Employeeid;
    private String Employeename;

    public Department(){

    }

    public Integer getDeptid() {
        return Deptid;
    }

    public void setDeptid(Integer deptid) {
        Deptid = deptid;
    }

    public String getDeptname() {
        return Deptname;
    }

    public void setDeptname(String deptname) {
        Deptname = deptname;
    }

    public String getEmployeename() {
        return Employeename;
    }

    public void setEmployeename(String employeename) {
        Employeename = employeename;
    }

    public Integer getEmployeeid() {
        return Employeeid;
    }

    public void setEmployeeid(Integer employeeid) {
        Employeeid = employeeid;
    }

    public Department(Integer deptid, String deptname, Integer employeeid, String employeename) {
        Deptid = deptid;
        Deptname = deptname;
        Employeeid = employeeid;
        Employeename = employeename;
    }
}
