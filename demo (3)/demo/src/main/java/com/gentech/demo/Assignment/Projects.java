package com.gentech.demo.Assignment;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Projects {

    public Projects(){

    }

    public Projects(Integer projectid, String projectname, Integer employeeid, String employeename) {
        Projectid = projectid;
        Projectname = projectname;
        Employeeid = employeeid;
        Employeename = employeename;
    }

    public Integer getProjectid() {
        return Projectid;
    }

    public void setProjectid(Integer projectid) {
        Projectid = projectid;
    }

    public String getProjectname() {
        return Projectname;
    }

    public void setProjectname(String projectname) {
        Projectname = projectname;
    }

    public Integer getEmployeeid() {
        return Employeeid;
    }

    public void setEmployeeid(Integer employeeid) {
        Employeeid = employeeid;
    }

    public String getEmployeename() {
        return Employeename;
    }

    public void setEmployeename(String employeename) {
        Employeename = employeename;
    }

    private Integer Projectid;
    private String Projectname;
    private Integer Employeeid;
    private String Employeename;

}
