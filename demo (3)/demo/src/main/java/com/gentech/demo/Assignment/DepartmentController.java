package com.gentech.demo.Assignment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DepartmentController {

    @GetMapping("/getalldepartments")
    public List<Department> getalldepartments(@RequestParam Integer deptid, @RequestParam String deptnmae, @RequestParam Integer empid,@RequestParam String empname){
        List<Department> dept=new ArrayList<>();
        dept.add(new Department(deptid,deptnmae,empid,empname));
        dept.add(new Department(1,"Electronics",1,"Vijay"));
        dept.add(new Department(2,"ComputerScience",2,"Vijay"));
        dept.add(new Department(3,"Electronics",4,"Vijay"));
        dept.add(new Department(4,"Electronics",5,"Vijay"));
        dept.add(new Department(5,"Electronics",3,"Vijay"));
        return dept;
    }

    @GetMapping("/getdepartment")
    public Object getdepartment(@RequestParam Integer deptid){
        Department d=new Department();
        List<Department> dept=new ArrayList<>();
        dept.add(new Department(1,"Electronics",3,"Vijay"));
        dept.add(new Department(2,"ComputerScience",2,"Vijay"));
        dept.add(new Department(3,"Electronics",1,"Vijay"));

        List<Department>list=dept.stream().filter(d1->d1.getDeptid().equals(deptid)).toList();
        return list.isEmpty()?"Dept id not found":list;

    }
    @GetMapping("/getdepartmentbydname")
    public Object getdepartmentbyname(@RequestParam String dname){
        Department d=new Department();
        List<Department> dept=new ArrayList<>();
        dept.add(new Department(1,"Electronics",3,"Vijay"));
        dept.add(new Department(2,"ComputerScience",2,"Surya"));
        dept.add(new Department(3,"Electronics",1,"Rohith"));

        List<Department>depts=dept.stream().filter(d1 -> d1.getDeptname().equals(dname)).toList();
        return depts.isEmpty()?"requested deptname not found":depts;


        }
    @GetMapping("/getdepartmentbyempname")
    public Object getdepartmentbyempname(@RequestParam String empname){
        Department d=new Department();
        List<Department> dept=new ArrayList<>();
        dept.add(new Department(1,"Electronics",3,"Vijay"));
        dept.add(new Department(2,"ComputerScience",2,"Rohith"));
        dept.add(new Department(3,"Electronics",1,"Bharath"));

        List<Department>depts=dept.stream().filter(d1 -> d1.getEmployeename().equals(empname)).toList();
        return depts.isEmpty()?"requested deptname not found":depts;


    }
    @GetMapping("/getdepartmentbyidanddname")
    public Object getdepartmentbyidandname(
            @RequestParam Integer id,
            @RequestParam String empname) {

        List<Department> dept = new ArrayList<>();
        dept.add(new Department(1, "Electronics", 3, "Vijay"));
        dept.add(new Department(2, "ComputerScience", 2, "Vijay"));
        dept.add(new Department(3, "Electronics", 1, "Vijay"));

        List<Department> result = dept.stream()
                .filter(d -> d.getDeptid().equals(id)
                        && d.getEmployeename().equalsIgnoreCase(empname))
                .toList();

        return result.isEmpty() ? "Department not found" : result;
    }



}
