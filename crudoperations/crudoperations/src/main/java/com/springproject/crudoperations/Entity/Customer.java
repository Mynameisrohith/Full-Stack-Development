package com.springproject.crudoperations.Entity;


import jakarta.persistence.*;

@Entity
@Table(name="customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customerid")
    private Integer Customerid;

    public Customer(){

    }
    public Integer getCustomerid() {
        return Customerid;
    }

    public void setCustomerid(Integer customerid) {
        Customerid = customerid;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public Long getPhoneno() {
        return Phoneno;
    }

    public void setPhoneno(Long phoneno) {
        Phoneno = phoneno;
    }

    @Column(name = "customername")
    private String CustomerName;
    @Column(name = "location")
    private String Location;
    @Column(name = "phoneno")
    private Long Phoneno;


    public Customer(Integer customerid, String customerName, String location, Long phoneno) {
        Customerid = customerid;
        CustomerName = customerName;
        Location = location;
        Phoneno = phoneno;
    }
}
