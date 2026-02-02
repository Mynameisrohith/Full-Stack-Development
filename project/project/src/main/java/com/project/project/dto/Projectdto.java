package com.project.project.dto;
import java.time.LocalDateTime;
public class Projectdto {

    public Projectdto(){

    }
    private Integer projectid;
    private String ProjectName;
    private String description;
    private String status;
    private String clientName;
    private LocalDateTime startdate;
    private LocalDateTime enddate;
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

    public LocalDateTime getStartdate() {
        return startdate;
    }

    public void setStartdate(LocalDateTime startdate) {
        this.startdate = startdate;
    }

    public LocalDateTime getEnddate() {
        return enddate;
    }

    public void setEnddate(LocalDateTime enddate) {
        this.enddate = enddate;
    }

    public Projectdto(Integer projectid, String projectName, String description, String status, String clientName, LocalDateTime startdate, LocalDateTime enddate) {
        this.projectid = projectid;
        ProjectName = projectName;
        this.description = description;
        this.status = status;
        this.clientName = clientName;
        this.startdate = startdate;
        this.enddate = enddate;
    }


}
