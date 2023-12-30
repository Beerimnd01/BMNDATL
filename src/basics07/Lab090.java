package src.basics07;

import java.util.Scanner;

public class Lab090 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter name");
        //System.out.println(Scanner.next());

    }
    public static void main(int a) { // main Overloading
        System.out.println("Another Main");
    }
    public static int main(int a,int c,int d) {
        return 99;
    }

    public static void main(int a,int b) {
        System.out.println("Another Main");
    }
}
