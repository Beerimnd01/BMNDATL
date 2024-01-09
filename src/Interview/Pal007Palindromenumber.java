package src.Interview;

import java.util.Scanner;

public class Pal007Palindromenumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the num");
        int num=sc.nextInt();
        int remainder;
        int revnum=0;
                int sum=0;

        while(num>0){
            remainder=num%10;

            sum=sum*10+remainder;
            num=num/10;


        }
        if (sum==num){
            System.out.println("palindrome");
        }
        else {
            System.out.println("not a palindrome");
        }

    }
}
