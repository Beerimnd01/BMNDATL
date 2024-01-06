package src.basics07;

public class Lab093 {
    public static void main(String[] args) {
        String name="Arundhathi";
        String rev="";
        for(int i=name.length()-1;i>=0;i--){
            rev=rev+name.charAt(i);

        }
        System.out.println(rev);

    }
}
