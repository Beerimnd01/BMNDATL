package src.oops14jan2004.Interview;

public class abstract01 {

}
abstract class person01{
    abstract void say();
     void eat(){
         System.out.println("hello eat from person");
     };
     abstract void nofood();
}
abstract class student01 extends person01{ // this is abstract class not necessary to complete methods in parent class
    abstract void hello();

}
class promod01 extends student01{

    @Override
    void say() {
        System.out.println("hello");

    }

    @Override
    void nofood() {

    }

    @Override
    void hello() {

    }
}