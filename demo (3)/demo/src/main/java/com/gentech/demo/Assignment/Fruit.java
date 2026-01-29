package com.gentech.demo.Assignment;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Fruit {
    private Integer id;
    private String name;
    private Integer quantity;
    private String color;

    public Fruit(){

    }
    public Fruit( Integer id, Integer quantity,String color, String name) {
        this.color = color;
        this.name = name;
        this.id = id;
        this.quantity = quantity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
