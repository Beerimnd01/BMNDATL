package src.oops21jan2024;

import java.util.Enumeration;
import java.util.Vector;

public class Lab163 {
    public static void main(String[] args) {
        Vector vect= new Vector<>();
        vect.add("rama");
        vect.add("lashmana");
        vect.add("Hunman");

        Enumeration e=  vect.elements();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }

    }
}
