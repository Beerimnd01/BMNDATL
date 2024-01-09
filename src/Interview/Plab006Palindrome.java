package src.Interview;

import java.util.Scanner;

public class Plab006Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String str=sc.next().toUpperCase();
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.println("palindrom");
        }
        else {
            System.out.println("not a palindrom");
        }
    }
}
