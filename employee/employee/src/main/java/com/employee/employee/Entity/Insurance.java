package com.employee.employee.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="insurance")
public class Insurance {

     public Insurance(){

    }
    public Insurance(Integer insuranceid, String insurancename, String insurancetype, String description) {
        this.insuranceid = insuranceid;
        this.insurancename = insurancename;
        this.insurancetype = insurancetype;
        this.description = description;
    }

    public Integer getInsuranceid() {
        return insuranceid;
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

    @Id
    @Column(name="id")
    private Integer insuranceid;
    @Column(name="insurance_name")
    private String insurancename;
    @Column(name="insurance_type")
    private String insurancetype;
    @Column(name="insurance_description")
    private String description;

}
