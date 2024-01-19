package src.Interview;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HasMap {
    public static void main(String[] args) {
        //HasMap m = new HasMap();
        HashMap<Integer, String> m= new HashMap<>();
        m.put(101, "beeraiah");
        m.put(102, "mandadi");
        m.put(103, "hello");
        System.out.println(m);
        System.out.println(m.get(103));
        m.remove(103);
        System.out.println(m.containsKey(102));
        System.out.println(m.isEmpty());
        System.out.println(m.keySet());

        System.out.println(m.values());
        System.out.println(m.entrySet());

        for(int i:m.keySet()){
            System.out.println(i);
            System.out.println(i+"  "+m.get(i));
        }
        for(String j: m.values()){
            System.out.println(j);
        }
        for(Map.Entry entry:m.entrySet()){

            System.out.println(entry.getKey()+" "+entry.getValue());
        }
     Set s=m.entrySet();
     Iterator itr= s.iterator();
     while(itr.hasNext()){
       Map.Entry entry= (Map.Entry) itr.next();
         System.out.println(entry.getKey()+" "+entry.getValue());
     }
    }
}

