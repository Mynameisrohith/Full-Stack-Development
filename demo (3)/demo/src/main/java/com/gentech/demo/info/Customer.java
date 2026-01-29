package com.gentech.demo.info;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;


@RestController
public class Customer {

    @GetMapping("/getname")
    public String getMessage(){
        return "Welcome to SpringBoot";
    }
    @GetMapping("/getdescription")
    public String getDescription(){
        return "Description for the Customer ";
    }
    @GetMapping("/getcustomerdetails")

    public ArrayList<String>  getallusers(){
        ArrayList<String> s=new ArrayList<>();
        s.add("Rohith");
        s.add("Bharath");
        s.add("Nagesh");
        return s;
    }
}
