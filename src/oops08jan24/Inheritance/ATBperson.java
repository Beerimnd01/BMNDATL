package src.oops08jan24.Inheritance;

public class ATBperson {
    String name;
    int age;
    long phone;
    String email;
    boolean isMarried;
    String courseName;
    // Default Constructor
    ATBperson(){
        courseName="ATB";
        System.out.println("i am default");
    }
    //param Constructor
    ATBperson(String valueObjectref){
        this.name=valueObjectref;

    }

    void talk(){
        System.out.println("talk");
    }
    void printDetails (){
        System.out.println(this.name);
        System.out.println(courseName);
    }
}
