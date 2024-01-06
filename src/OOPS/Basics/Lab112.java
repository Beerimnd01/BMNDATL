package src.OOPS.Basics;

import java.util.Scanner;

public class Lab112 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the string");
        String str1=sc.next();
        str1=str1.toLowerCase();
        String str2="";
        for(int i=str1.length()-1;i>=0;i--){
            str2=str2+str1.charAt(i);

        }
        System.out.println(str2);
        if(str1.equalsIgnoreCase(str2)){
            System.out.println("palindrome");

        }
        else{
            System.out.println("not a palindrome");
        }
    }


}
