package src.OOPS.Basics;

public class Lab108 {
    public static void main(String[] args) {
        // Immutable in nature (that can't changed)
        String s1 = "Beera";
        String s2 = new String("Beera");

        // Mutable - that can be changed!!
        StringBuilder str1= new StringBuilder("Beera"); //Not Thread safe-- not Synchronized--java1.5 Faster
        str1.append("iah");
        System.out.println(str1); //Beeraiah

        StringBuffer str2= new StringBuffer("Beera");//Thread safe --Synchronized--java1.0 slower
        str2.append("iah");
        System.out.println(str2); //Beeraiah

        //both are same but Builder we can use
    }
}
