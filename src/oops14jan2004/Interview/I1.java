package src.oops14jan2004.Interview;

public class I1 {
    public static void main(String[] args) {
        System.out.println(  H.a);
        Pramod p= new Pramod();
        p.m1();

    }
}
interface H{
    //only static variables
    public static final int c=22;
    int a=10; // need not create anything it will static and final in nature in interface
    int b=20;
    void m1(); // non static only varibale


}
class Pramod implements H{

    @Override
    public void m1() {

    }
}
