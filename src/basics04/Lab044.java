package src.basics04;

import java.util.Scanner;

public class Lab044 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int side1=sc.nextInt();
        int side2=sc.nextInt();
        int side3=sc.nextInt();
        if ((side1==side2)&&(side2==side3)&&(side3==side1)){
            System.out.println("equit");

        }
        else if ((side1 == side2) || (side1 == side3) || (side2 == side3)){
            System.out.println("ISO");}
            else{
            System.out.println("scalene");
            }

        }
    }

