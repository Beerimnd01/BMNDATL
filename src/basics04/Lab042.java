package src.basics03.basics04;

import java.util.Scanner;

public class Lab042 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the score");
        int score = sc.nextInt();
        if (score >= 90 && score <= 100) {
            System.out.println("your score --> A");
        } else if (score >= 80 && score <= 90) {


            System.out.println("your score --> B");
        } else if (score >= 70 && score <= 80) {
            System.out.println("your score --> C");

        } else if (score >= 60 && score <= 69) {
            System.out.println("You score -> D");

        } else {
            System.out.println("fail");
        }
    }
}
