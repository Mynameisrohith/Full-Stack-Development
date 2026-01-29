package gentech.com.Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetDemo {

    public static void main(String[] args) {

        List<String> l=new ArrayList<>();
        String str[]=new String[]{"Rohith","Bharath","Mohan","Mama","Mama"};
        Set<String> s=new HashSet<>();

        for(String i:str){
            l.add(i);
        }
        s.addAll(l);
        System.out.println(s);
    }
}
