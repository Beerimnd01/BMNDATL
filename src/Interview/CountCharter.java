package src.Interview;

import java.util.HashMap;

public class CountCharter {
    public static void main(String[] args) {

        String str="Beeraiah";
        System.out.println(str);
        HashMap<Character,Integer> mc= new HashMap<>();
        for( Character c:str.toCharArray()){
            if(mc.containsKey(c)){
                mc.put(c,mc.get(c)+1);

            }
            else{
                mc.put(c,1);
            }
        }
        System.out.println(mc);

    }
}
