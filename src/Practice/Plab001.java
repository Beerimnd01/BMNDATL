package src.Practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Plab001 {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the number");
            int num= sc.nextInt();
            int flag= 0;
            int m=num/2;
            if(num==0||num==1){
                System.out.println("not a prime number");
            }else {
                for(int i=2; i<=m; i++){
                   if( num%i==0){
                       System.out.println("not a prime number");
                       flag=1;
                       break;
                   }


                }

            }
            if(flag==0){
                System.out.println("prime number");
            }
        }catch (InputMismatchException e){
           // e.printStackTrace();
            System.out.println("please enter whole number");
        }

    }
}
