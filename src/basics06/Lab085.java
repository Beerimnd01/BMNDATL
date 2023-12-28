package src.basics06;

public class Lab085 {
    public static void main(String[] args) {
        int a =10;
        int b =20;
        System.out.println("a val" +a+"b val"+b);
        //swapping numbers without using third variable
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a val" +a+"b val"+b);

    }

}
