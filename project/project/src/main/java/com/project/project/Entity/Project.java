package com.project.project.Entity;


import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="customer")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer projectid;
    private String ProjectName;
    private String description;
    private String status;
    private String clientName;

    public Integer getProjectid() {
        return projectid;
    }

    public void setProjectid(Integer projectid) {
        this.projectid = projectid;
    }

    public String getProjectName() {
        return ProjectName;
    }

    public void setProjectName(String projectName) {
        ProjectName = projectName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    private Date startdate;
    private Date enddate;

    public Project(Integer projectid, String projectName, String description, String status, String clientName, Date startdate, Date enddate) {
        this.projectid = projectid;
        ProjectName = projectName;
        this.description = description;
        this.status = status;
        this.clientName = clientName;
        this.startdate = startdate;
        this.enddate = enddate;
    }

    public Project(){

    }






}
