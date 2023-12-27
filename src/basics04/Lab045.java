package src.basics03.basics04;

import java.util.Scanner;

public class Lab045 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number ");
        int weekday=sc.nextInt();
        switch(weekday){
            case 1:
                System.out.println("sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sun");
                break;
            default:
                System.out.println("ARE YOU MAD?");
                break; // This break optional if default is last option
        }

        System.out.println(" - End of Program - ");

        }

    }

