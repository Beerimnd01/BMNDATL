package src.oops14jan2004.InnerClass;

public class Lab135 {

    public static void main(String[] args) {

        Pramod.Ipad inc= new Pramod.Ipad();
        inc.eating();
        //inc.eay();
     ;


    }

}
class Pramod {
    int age = 31; // Data Memebers / Instances Variables

    // Methods
    void eay() {
        System.out.println("I am eating");
    }

    static class Ipad {
        void eating() {
            System.out.println("I am IPAD");
            //System.out.println(age);
        }
    }
}


