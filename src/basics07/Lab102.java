package src.basics07;

import java.util.Scanner;

public class Lab102 {
    public static void main(String[] args) {
        int i=0;
        int flag=0;
        int m=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        m=num/2;
        if(num==0||num==1){
            System.out.println("is not a prime number" );
        }else{
            for( i=2; i<=m;i++) {
                if (num % i == 0) {
                    System.out.println(num + "is not a prime number");
                    flag = 1;
                    break;
                }
            }
                if (flag==0){



                    System.out.println(num+"is a prime number" );

            }


        }

    }
}
