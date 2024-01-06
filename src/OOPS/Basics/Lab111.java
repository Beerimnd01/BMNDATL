package src.OOPS.Basics;

import java.util.Scanner;

public class Lab111 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string to check the palindrom or not");
        String input_data= sc.next();
        input_data=input_data.toLowerCase();
        boolean result=isPalindrome(input_data);
        if(result){
            System.out.println("palndrome");

        }
        else {
            System.out.println("not a palindrome");
        }
    }
    static boolean isPalindrome(String input_data){ //in method here input_data=anything
        String orginalStr=input_data;
        StringBuilder sb=new StringBuilder(input_data);
        String reverse_string =sb.reverse().toString();
        return orginalStr.equalsIgnoreCase(reverse_string);

    }
}
