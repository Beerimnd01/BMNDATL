package src.basics07;

public class Lab086 {
    public static void main(String [] args){
        int C= sum(3, 5);
        int C1=sum1(5);
        int C2=sum2();
        int C3=sum3(10,20,30);
        System.out.println(C);
        System.out.println(C1);
        System.out.println(C2);
        System.out.println(C3);
        sayHello();

    }
    static int sum(int a, int b){
        return a+b;

    }
    static int sum1(int a){
        return a;

    }
    static int sum2(){
        return 56;

    }
    static int sum3(int a, int b, int c){
        return a+b+c+20;

    }
    static void sayHello(){
        System.out.println("Say yes");
    }

}
