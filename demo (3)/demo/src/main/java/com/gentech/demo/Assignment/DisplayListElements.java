package com.gentech.demo.Assignment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
@RestController
public class DisplayListElements {

    @GetMapping("/getlistofnames/{id}")
    public ArrayList<String> getelements(@PathVariable String id){
        ArrayList<String> e=new ArrayList<>();
        e.add(id);
        e.add("Rohith");
        e.add("sanjay");
        e.add("suraj");
        e.add("surya");
        return e;

    }
    @GetMapping("/getlinkedelements/{id}")
    public LinkedList<String> getlinkedelements(@PathVariable String id){
        LinkedList<String> e=new LinkedList<>();
        e.add(id);
        e.add("Rohith");
        e.add("sanjay");
        e.add("suraj");
        e.add("surya");
        return e;

    }
    @GetMapping("/gethashelements/{id}")
    public HashSet<String> gethashelements(@PathVariable String id){
        HashSet<String> e=new LinkedHashSet<>();
        e.add(id);
        e.add("Rohith");
        e.add("sanjay");
        e.add("suraj");
        e.add("surya");
        return e;

    }
    @GetMapping("/gettreesetelements/{id}")
    public TreeSet<String> gettreesetelements(@PathVariable String id){
        TreeSet<String> e=new TreeSet<>();
        e.add(id);
        e.add("Rohith");
        e.add("sanjay");
        e.add("suraj");
        e.add("surya");
        return e;

    }
    @GetMapping("/gethashmapelements/{id}")
    public HashMap<Integer,String> gethashmaplements(@PathVariable String id){
        HashMap<Integer,String> e=new HashMap<Integer,String>();

        e.put(1,"Rohith");
        e.put(2,"manjanna");
        e.put(3,"sanjay");
        e.put(4,"suraj");
        return e;

    }
    @GetMapping("/gettreemapelements/{id}")
    public TreeMap<String,String> gettreemapelements(@PathVariable String id){
        TreeMap<String,String> e=new TreeMap<String,String>();
        e.put("id","1");
        e.put("name","Rohith");
        e.put("name1","manjanna");
        e.put("name2","sanjay");
        e.put("name3","suraj");
        e.put("name4","bharath");
        return e;

    }
}
