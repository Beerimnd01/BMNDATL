package src.Interview;

import javax.print.attribute.standard.PrinterMessageFromOperator;
import java.util.Scanner;

public class Plab009Trycatch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        int m, flag = 0;
        m = num / 2;


        if (num == 0 || num == 1) {
            System.out.println("not a prime number");
        } else {
            for (int i = 2; i <= m; i++) {
                if (num % i == 0) {
                    System.out.println("not a prime number");
                    flag = 1;
                    break;
                }
            }

        }
        if (flag==0){
            System.out.println("prime number");
        }
    }
}

