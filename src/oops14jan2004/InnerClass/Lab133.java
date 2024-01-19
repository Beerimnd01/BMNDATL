package src.oops14jan2004.InnerClass;

public class Lab133 {
    public static void main(String[] args) {
        car c= new car("lambo227");
        car.Engine en= c.new Engine("500cc");
        en.start();
        c.drive();

        // OC.IC ref = OCRef.new IC();

    }


}


class car{


    String make;

    public car(String make) {
        this.make = make;
    }
    void drive(){
        System.out.println("You can driver Car");
    }

    public class Engine {



        // Instance Variables
        String hoursePower;

        public Engine(String hoursePower) {
            this.hoursePower = hoursePower;
        }
        void start(){
            System.out.println("Enginer is started!! -> " + make);
        }
    }
}