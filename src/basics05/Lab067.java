package src.basics05;

public class Lab067 {
    public static void main(String[] args) {

        // While -> Init -> Condition -> Body -> Increment

        // Do While
        // Do While -> Init -> Body -> Condition -> Increment
        int a = 0;
        do {
            System.out.println(a);
            a--;
        } while (a > -5);

        int i = 1; // Init
        do {
            System.out.println(i); // Body
            i++; // Increment
        } while (i < 10); // Condition
    }
}
