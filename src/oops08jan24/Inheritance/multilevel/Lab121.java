package src.oops08jan24.Inheritance.multilevel;

public class Lab121 {
    public static void main(String[] args) {
        Programming p=new Programming();
        p.printInfo();
        // Parent Class/ SuperClass / Base Class
        // How JVM understand this program

        // Programming - Class
        // p ->  ref to the Object
        // new Programming() ->  Object
        // DC is called
     Programming p2= new Programming("perl",12);
p2.printInfo();
        // ## What is Inheritance?
        // Inheritance provides a way to create a new class from an existing class
        // SuperClass | Parent Class | Base Class
        // SubClass | Child Class | Derived Class
        // The extends Keyword

        // SubClass extends SuperClass{
        ////contents of SubClass
    }
}
