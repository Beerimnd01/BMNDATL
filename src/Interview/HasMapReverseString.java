package src.Interview;

import java.util.HashMap;

public class HasMapReverseString {
    public static void main(String[] args) {
        HashMap<Integer,String> m= new HashMap<>();
        m.put(101, "Accolite");
        System.out.println(m.get(101));
        String name= m.get(101);
        String rev=" ";
        for(int i =name.length()-1;i>=0;i--){
            rev=rev+name.charAt(i);
        }
        System.out.println(rev.trim());

    }
}
