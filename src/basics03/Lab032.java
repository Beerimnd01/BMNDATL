package src.basics03;

import java.sql.SQLOutput;

public class Lab032 {
    public static void main(String[] args) {

        String s1="hello";
        String S2="Guys";
                String S3="Hello Guys";
        String S4=s1.concat(S2);
        System.out.println(S4);

        System.out.println(S4 instanceof Object);
        System.out.println(S4 instanceof String);
        //Result of instanceof operator is boolean value.

    }
}
