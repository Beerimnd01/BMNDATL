package src.oops13jan2024.encapusalation.GS;

public class Lab123 {
    public static void main(String[] args) {

        ICICBank IB= new ICICBank("Beera", 100);
        IB.setName("manda");// this fine
        IB.setBal(-1);//real time not possible to set th bal need to private the variable.
    }



}
