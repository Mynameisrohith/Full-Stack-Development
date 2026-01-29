package com.gentech.demo.Assignment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

@RestController
public class TaskController {

    @GetMapping("/gettasks")
    public List<Tasks> getalltasks(@RequestParam String id){
        List<Tasks> task=new ArrayList<>();
        task.add(new Tasks(1,"createapi",1,"rohith"));
        task.add(new Tasks(2,"modifyapi",2,"sanjay"));
        task.add(new Tasks(3,"createdatabase",3,"suraj"));
        task.add(new Tasks(4,"createcontrollers",4,"yogeesh"));

        return task;
    }
}
