package com.employee.employee.Dto;

public class InsuranceDto {
    private Integer insuranceid;
        private String insurancename;

    public Integer getInsuranceid() {
        return insuranceid;
    }

    public InsuranceDto(Integer insuranceid, String insurancename, String insurancetype, String description) {
        this.insuranceid = insuranceid;
        this.insurancename = insurancename;
        this.insurancetype = insurancetype;
        this.description = description;
    }

    public void setInsuranceid(Integer insuranceid) {
        this.insuranceid = insuranceid;
    }

    public String getInsurancename() {
        return insurancename;
    }

    public void setInsurancename(String insurancename) {
        this.insurancename = insurancename;
    }

    public String getInsurancetype() {
        return insurancetype;
    }

    public void setInsurancetype(String insurancetype) {
        this.insurancetype = insurancetype;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private String insurancetype;
        private String description;
}
