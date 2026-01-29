package com.gentech.demo.Assignment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class FruitController {

    @GetMapping("/getfruitsnames")
    public List<Fruit> getfruits(@RequestParam String id){
        List <Fruit> l=new ArrayList<>();
        l.add(new Fruit(1,10,"yellow","banana"));
        l.add(new Fruit(2,20,"red","apple"));
        l.add(new Fruit(3,30,"green","watermelon"));
        l.add(new Fruit(4,40,"orange","orange"));
        l.add(new Fruit(5,50,"yellow","mango"));

        return l;

    }
    @GetMapping("/getfruit")
    public Object getdepartment(@RequestParam Integer fruitid){
        List <Fruit> l=new ArrayList<>();

        l.add(new Fruit(1,10,"yellow","banana"));
        l.add(new Fruit(2,20,"red","apple"));
        l.add(new Fruit(3,30,"green","watermelon"));
        l.add(new Fruit(4,40,"orange","orange"));
        l.add(new Fruit(5,50,"yellow","mango"));
        List<Fruit>list=l.stream().filter(d1->d1.getId().equals(fruitid)).toList();
        return list.isEmpty()?"Dept id not found":list;

    }
    @GetMapping("/getbyfruitname")
    public Object getdepartmentbyname(@RequestParam String fruitname){
        List <Fruit> l=new ArrayList<>();
        l.add(new Fruit(1,10,"yellow","banana"));
        l.add(new Fruit(2,20,"red","apple"));
        l.add(new Fruit(3,30,"green","watermelon"));
        l.add(new Fruit(4,40,"orange","orange"));
        l.add(new Fruit(5,50,"yellow","mango"));

        List<Fruit>depts=l.stream().filter(d1 -> d1.getName().equals(fruitname)).toList();
        return depts.isEmpty()?"requested deptname not found":depts;


    }
    @GetMapping("/getfruitbyquantity")
    public Object getdepartmentbyquantity(@RequestParam Integer quantity){
        List <Fruit> l=new ArrayList<>();
        l.add(new Fruit(1,10,"yellow","banana"));
        l.add(new Fruit(2,20,"red","apple"));
        l.add(new Fruit(3,30,"green","watermelon"));
        l.add(new Fruit(4,40,"orange","orange"));
        l.add(new Fruit(5,50,"yellow","mango"));

        List<Fruit>depts=l.stream().filter(d1 -> d1.getQuantity().equals(quantity)).toList();
        return depts.isEmpty()?"requested fruitname not found with that quantity":depts;


    }
    @GetMapping("/getfruitbyidandname")
    public Object getdepartmentbyidandname(
            @RequestParam Integer id,
            @RequestParam String fruitname) {

        List <Fruit> l=new ArrayList<>();
        l.add(new Fruit(1,10,"yellow","banana"));
        l.add(new Fruit(2,20,"red","apple"));
        l.add(new Fruit(3,30,"green","watermelon"));
        l.add(new Fruit(4,40,"orange","orange"));
        l.add(new Fruit(5,50,"yellow","mango"));

        List<Fruit> result = l.stream()
                .filter(d -> (d.getId()).equals(id)
                        && d.getName().equalsIgnoreCase(fruitname))
                .toList();

        return result.isEmpty() ? "Fruit not found" : result;
    }


}
