package src.Interview;

import java.util.Scanner;

public class Plab003PrimeNumber {
    public static void main(String[] args) {
        int flag=0;

        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        int m=num/2;
        if(num==0||num==1){
            System.out.println(num+"  "+"not a prime number");
        }else {
            for(int i=2;i<=m;i++){
                if(num%i==0){
                    System.out.println(num+"  "+"not a prime number");
                    flag=1;
                    break;
                }
            }
        }
        if(flag==0){
            System.out.println(num+"  "+"a prime number");

        }
    }
}
