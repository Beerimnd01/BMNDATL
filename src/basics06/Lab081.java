package src.basics06;

import java.util.Scanner;

public class Lab081 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        int num= sc.nextInt();
       // if (num==0||num==1){
          //  System.out.println("not a prime number");

        //}
        //else{

        if (num==0||num==1){
            System.out.println("not a prime prime number wil start from 2");
        } else if (num==2) {
            System.out.println("Prime number 2");

        } else if(!(num==0||num==1))
            for (int i=2; i<num; i++){
               if ((num%i==0)){
                    System.out.println(" not a prime number  "+num);
                    break;
        }
               else {
                   System.out.println("prime");
                   break;



                }

            }

        }

        
            }






