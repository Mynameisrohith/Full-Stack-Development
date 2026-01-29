package com.gentech.demo.Assignment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentControllers {

    @GetMapping("/getstudents")
    public List<Students> getallstudents(@RequestParam String id){
        Students s=new Students();
        List<Students> l=new ArrayList<>();
        l.add(new Students("Rohith","drohith70702gmail.com","Tumkur"));
        l.add(new Students("manjunath","manjunath@gmail.com","kolar"));
        l.add(new Students("Vijay","vijay@gmail.com","hassan"));
        l.add(new Students("Bharath","bharath@gmail.com","bangalore"));
        return l;

    }
}
