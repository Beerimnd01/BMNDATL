package src.oops08jan24.Inheritance.hierarchical;

public class Lab123 {
    public static void main(String[] args) {

        Car c=new Car();
        Truck T= new Truck();
      //  Car C=new Vechile(); Child class we cant use as ref class
        Vechile V1= new Car();

        Vechile v=new Vechile();
        v.vechilehasTobestopped();
    }
}
