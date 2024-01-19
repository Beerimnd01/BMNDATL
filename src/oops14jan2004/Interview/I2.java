package src.oops14jan2004.Interview;

public class I2 {
    public static void main(String[] args) {

        System.out.println(PP.a);

        PP f= new foo(); // Dynmic dispatch // Concereate class as an object
        Rofl f1= new foo();  // Dynmic dispatch
        foo f3= new foo();
        f.m2();
        f1.say();


    }
}

    interface PP {
        int a = 10;

        void m2();
    }

    abstract class Rofl implements PP {
        abstract void say();
    }

    class foo extends Rofl {

        @Override
        public void m2() {
            System.out.println("m2");
        }

        @Override
        void say() {
            System.out.println("say");
        }
    }
