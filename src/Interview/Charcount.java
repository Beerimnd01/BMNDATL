package src.Interview;

import java.util.HashMap;

public class Charcount{
    public static void getCharCount(String name){
        HashMap<Character, Integer> CharMap= new HashMap<>();
        char StrArry[] =name.toCharArray();

       for (char c:StrArry){
           if(CharMap.containsKey(c)){
               CharMap.put(c, CharMap.get(c)+1);
           }else{
               CharMap.put(c,1);
           }

       }
        System.out.println(name+":"+ CharMap);
        System.out.println(CharMap.entrySet());


    }

    public static void main(String[] args) {
        getCharCount("Beeeraiah");
        getCharCount("Arundhathi");
    }

}
