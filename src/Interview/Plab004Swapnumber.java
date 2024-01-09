package src.Interview;

public class Plab004Swapnumber {
    public static void main(String[] args) {
        int a=13;
        int b=12;
       // a=a+b;
       // b=a-b;
       // a=a-b;
       // System.out.println("a value"+a+"b value"+b);
        int temp;
        temp=a;
        a=b;
        b=temp;

        System.out.println("a value"+a+"b value"+b);
    }
}
