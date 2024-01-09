package src.Interview;

public class Plab005ReverseString {
    public static void main(String[] args) {

        String name="Beeraiah";
        String rev="";


        for(int i=name.length()-1;i>=0;i--){
            rev=rev+name.charAt(i);

        }
        System.out.println(rev);

        StringBuilder str= new StringBuilder("Adhaya");
       str.reverse();
        System.out.println(str);

    }

}
