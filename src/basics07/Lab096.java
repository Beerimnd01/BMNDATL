package src.basics07;

public class Lab096 {
    public static void main(String[] args) {

        // Write your code here
        int b = 10;
        System.out.println(--b + b++ + b--);
        // A  Exp -> 9, b -> 9
        // B Exp -> 9, b -> 9
        // C Exp -> 10->  b -> 9
        System.out.println(b);

    }
}
