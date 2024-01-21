package src.oops20jan2024;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab150 {
    public static void main(String[] args) throws Exception {
        main("Beera");
    }
    static void main(String a) throws Exception {

        // Code 100

        //101
        FileReader f = new FileReader(new File("C://a/txt"));
        if(a.equalsIgnoreCase("a")){
            throw new ArithmeticException();
        }
    }
}
