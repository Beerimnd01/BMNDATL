package src.oops13jan2024;

public class IV1 {

    public static void main(String[] args) {
        Person p= new Person();
        System.out.println(p.a);
        Person p1= new Person(23);
        System.out.println(p1.a);

        Person h3=new Person(23,true);
    System.out.println(h3.a);
    System.out.println(h3.b);
        System.out.println(p.b);
        p.a=99;
        System.out.println(p.a);
    }

}
class Person {
    int a;
    boolean b;

    // Default
    Person(){
        this.a = 10;
        System.out.println("hello");
    }

    // Parameter Constructor
    Person(int b){
        this.a = b; //  h2.a
        System.out.println("hello pm");
    }

    Person(int b,boolean a){
        this.a = b;
        this.b = a;
        System.out.println("hello two pm");
    }
}