package src.basics04;

public class Lab048 {
    public static void main(String[] args) {
        byte b=20;
        switch(b){
            case 10:
                System.out.println("TEN");
            case 127:
                System.out.println("ONE TWENTY EIGHT");
            default:
                System.out.println("Default");
        }
        int itemCode = 002;
        switch (itemCode) {
            case 001, 002, 003 :
                System.out.println("It's an electronic gadget!");
                break;
            case 004, 005:
                System.out.println("It's a mechanical device!");
            default:
                System.out.println("It's a software product!");
        }
        int itemCode1 = 001;
        switch (itemCode1) {
            case 001 -> System.out.println("It's a laptop!");
            case 002 -> System.out.println("It's a desktop!");
            case 003,004 -> System.out.println("It's a mobile phone!");
            default -> System.out.println("Heloo!");
        }
    }
}
