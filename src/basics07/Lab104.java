package src.basics07;

public class Lab104 {
    public static void main(String[] args) {
        String name="Beeraiah";
        String y="";
        for (int i=name.length()-1;i>=0;i--){
            y =y+name.charAt(i);
        }
        System.out.println(y);
    }
}
