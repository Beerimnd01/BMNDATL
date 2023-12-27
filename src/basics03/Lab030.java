package src.basics03;

public class Lab030 {
    public static void main(String[] args) {

        byte b=10;
        int a=b; // VALID – Implicit Casting
        int a1= (int)b; // VALID – Explicit Casting
        System.out.println(a1);

        String name = "The Testing Academy"; //SCP
        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        String name1 = new String("The Testing Academy"); //OA? HEAP Area
        System.out.println(name1);
    }
}
