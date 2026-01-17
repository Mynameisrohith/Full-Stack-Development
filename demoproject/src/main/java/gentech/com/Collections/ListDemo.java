package gentech.com.Collections;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {
        List<String> l=new ArrayList<>();
        String str[]=new String[]{"Rohith","Bharath","Mohan","Mama"};
        for(String i:str){
            l.add(i);
        }
        System.out.println(l);


    }
}
