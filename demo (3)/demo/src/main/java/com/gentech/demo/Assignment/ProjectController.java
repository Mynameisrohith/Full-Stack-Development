package com.gentech.demo.Assignment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

@RestController
public class ProjectController {

    @GetMapping("/getallprojects")
    public List<Projects> getallProjects(@RequestParam Integer projectid, @RequestParam String project, @RequestParam Integer empid, @RequestParam String empname){

        List <Projects>projects =new ArrayList<>();
        projects.add(new Projects(projectid,project,empid,empname));
        projects.add(new Projects(1,"project1",1,"rohith"));
        projects.add(new Projects(2,"project2",2,"bharath"));
        projects.add(new Projects(3,"project3",3,"surya"));
        projects.add(new Projects(4,"project4",4,"Vijay"));
        projects.add(new Projects(5,"Project5",5,"Johnson"));

        return projects;

    }
}
