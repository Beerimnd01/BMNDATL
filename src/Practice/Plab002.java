package src.Practice;

import java.util.Scanner;

public class Plab002 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int num;

        do {
            while (!sc.hasNextInt()) {
                System.out.println("you have enter invalid number");
                System.out.println("please enter valid number");

                sc.hasNextLine();
            }
            num = sc.nextInt();
            while (num <= 0) {
                System.out.println("enter valid num");

                num = sc.nextInt();
            }


        }
        while (!sc.hasNextInt()) ;
    }}

