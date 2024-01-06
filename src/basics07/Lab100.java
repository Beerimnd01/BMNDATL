package src.basics07;

import java.util.Scanner;

public class Lab100 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size");
        int n =sc.nextInt();
        int [] int_array=new int[n];
        System.out.println("enter the elements");
        for(int i=0;i<n;i++){
            int_array[i]= sc.nextInt();


        }
        System.out.println("output");
        for (int i=0;i<n;i++){
            System.out.println(int_array[i]);
        }


    }
}
