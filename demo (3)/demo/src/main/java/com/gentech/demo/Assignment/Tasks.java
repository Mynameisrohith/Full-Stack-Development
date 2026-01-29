package com.gentech.demo.Assignment;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Tasks {
    public Tasks(){

    }
    public Tasks(Integer taskid, String taskname, Integer employeeid, String employeename) {
        Taskid = taskid;
        Taskname = taskname;
        Employeeid = employeeid;
        Employeename = employeename;
    }

    public Integer getTaskid() {
        return Taskid;
    }

    public void setTaskid(Integer taskid) {
        Taskid = taskid;
    }

    public String getTaskname() {
        return Taskname;
    }

    public void setTaskname(String taskname) {
        Taskname = taskname;
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

    private Integer Taskid;
    private String Taskname;
    private Integer Employeeid;
    private String Employeename;

}
