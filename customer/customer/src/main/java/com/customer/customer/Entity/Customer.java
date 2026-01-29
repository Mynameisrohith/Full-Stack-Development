package com.customer.customer.Entity;


import jakarta.persistence.*;

@Entity
@Table(name="customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="cust_id")
    private Integer customerid;
    @Column(name="cust_name")
    private String customername;

    public Customer(){

    }
    public Customer(Integer customerid, String customername, String location, Long phoenno) {
        this.customerid = customerid;
        this.customername = customername;
        this.location = location;
        this.phoenno = phoenno;
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Long getPhoenno() {
        return phoenno;
    }

    public void setPhoenno(Long phoenno) {
        this.phoenno = phoenno;
    }

    @Column(name="place")
    private String location;
    @Column(name="phoneneumber")
    private Long phoenno;

}
