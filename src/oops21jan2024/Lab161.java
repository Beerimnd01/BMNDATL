package src.oops21jan2024;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab161 {
    public static void main(String[] args) {
        List<String> courseList= new ArrayList<>();
        courseList.add("Beera");
        courseList.add("Mandadi");
        courseList.add("aru");
        courseList.add("chinnu");
        courseList.add("Mallaiah");

        List numList= new ArrayList<>();
        numList.add("100");
        numList.add("101");
        numList.add("102");
        numList.add("103");

        courseList.addAll(numList);
        System.out.println(courseList);
        Iterator it = courseList.iterator();
        while(it.hasNext()){

           // courseList.add("Gen Ai");
            System.out.println(it.next());
        }



            }
        }


