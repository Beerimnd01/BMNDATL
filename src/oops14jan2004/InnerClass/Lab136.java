package src.oops14jan2004.InnerClass;

public class Lab136 {


    public static void main(String[] args) {

        Student s1 = new Student() {
            @Override
            public void setId() {

            }
        };

        s1.setId();

    }

    B b = new B() {
        // This is a Anoy class
        // No Name
    };





}


abstract class B{
    int var_b = 12;
}

interface Student{
    int id = 11;
    void setId();
}

//class NoName implements Student{
//
//    @Override
//    public void setId() {
//
//    }
//}
