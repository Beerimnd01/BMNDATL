package src.oops13jan2024;

public class IV4 {

    public static void main(String[] args) {
       // System.out.println(P04.a); // need to create the object to use the variable a
        System.out.println(P04.b); // for Static methods or variabes no need to create object
        P04.run2();
        System.out.println();
        //System.out.println(P04.run()); //// need to create the object to use the method run
    }
}


class P04 {
    int a;
    static int b;

    static void run2(){
        System.out.println("Hahah");
    }

    void run(){

    }
}
