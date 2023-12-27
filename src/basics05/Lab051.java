package src.basics05;

import java.util.Scanner;

public class Lab051 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number X");
        int X=sc.nextInt();
        System.out.println("enter number Y");
        double Y=sc.nextDouble();
        System.out.println("enter number Z");
        float Z=sc.nextFloat();
        double result;
        result=Math.cbrt(Math.pow(X,2)+Math.pow(Y,2)-Math.abs(Z));
        System.out.println(result);
        sc.close();
    }
}
