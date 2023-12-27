package src.basics05;

import java.util.Scanner;

public class Lab052 {
    public static void main(String[] args) {
        Scanner user_input=new Scanner(System.in);
        System.out.println("enter name ");
        String name=user_input.nextLine();
        System.out.println("enter age ");
        int age=user_input.nextInt();
        System.out.println("Enter Salary");
        double sal=user_input.nextDouble();

        System.out.println(name);
        System.out.println(age);
        System.out.println(sal);

    }
}
