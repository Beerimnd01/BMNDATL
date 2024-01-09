package src.Interview;

import java.util.Scanner;

public class Plab002Factorial {
    public static void main(String[] args) {
        int i,fact=1;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the factorial number");
        int num=sc.nextInt();
        for(i=1;i<=num;i++){
            fact=fact*i;
        }
        System.out.println(num+"factorial is"+fact);
    }
}
