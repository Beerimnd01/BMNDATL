package src.basics06;

import java.util.Scanner;

public class Lab082 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        long fact = 1;


        for(int i=1;i<=num;i++){
            fact=fact*i;


        }
        System.out.println(fact);
    }
}
