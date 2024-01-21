package src.oops20jan2024;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab153 {
    public static void main(String[] args) {


        String path = "C:/a.txt";
        try {
            FileInputStream f = new FileInputStream(path);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
