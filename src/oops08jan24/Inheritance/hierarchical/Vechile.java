package src.oops08jan24.Inheritance.hierarchical;

public class Vechile {
    Vechile(){
        System.out.println("Vechile DC");
    }
    void vechilehasTobestopped(){
        System.out.println("Yeah from "+getClass().getSimpleName());
        System.out.println(getClass().getName());
    }
}
