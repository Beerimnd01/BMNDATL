package src.oops20jan2024;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab151 {
    public static void main(String[] args) {
        //int a=10/0; //Jvm dont know -unchecked exception

        //checked exception
        try {
            FileReader f = new FileReader(new File("c://a.txt"));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
