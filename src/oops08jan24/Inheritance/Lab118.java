package src.oops08jan24.Inheritance;

public class Lab118 {
    public static void main(String[] args) {
        ATBperson p= new ATBperson();
        p.name="amit";
        p.printDetails();

        ATBperson p1= new ATBperson("beera");
        //p1.name="amit";
        p1.printDetails();

//        String s; // Local Variable default value is never assigned by JVM
//        System.out.println(s);



        // Constructor
        // Constructor is used to construct the object of a class.
        // name must be exactly the same as class
        // constructor is a special method.
        // it does not have a return type

        // - Default Constructor 18-19%
        //- Param Constructor - 70%
        // Copy Constructor in Java - <%1
    }

}
