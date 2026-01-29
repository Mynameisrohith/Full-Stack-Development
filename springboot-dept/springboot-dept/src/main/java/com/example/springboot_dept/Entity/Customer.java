package com.example.springboot_dept.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="customertable")

public class Customer {

    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="custid")
    private  Integer customerid;
    @Column(name="customername")
    private String customername;
    @Column(name="place")
    private String location;
    @Column(name="customerphonenum")
    private String phonenumber;

    public Customer(){

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

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Customer(Integer customerid, String customername, String location, String phonenumber) {
       this.customerid = customerid;
        this.customername = customername;
        this.location = location;
        this.phonenumber = phonenumber;
    }

}
