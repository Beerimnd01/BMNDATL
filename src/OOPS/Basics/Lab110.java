package src.OOPS.Basics;

public class Lab110 {
    public static void main(String[] args) {


        // Reverse String
        StringBuilder Str1= new StringBuilder("Beeraiah");

        StringBuilder str2=Str1.reverse();
        System.out.println(str2);

        // If something is Thread Safe, we avoid!
        // StringBuffer vs StringBuilder
        StringBuilder stringBuilder = new StringBuilder("Pramod");
        stringBuilder.reverse();
        System.out.println(stringBuilder);


    }
}
