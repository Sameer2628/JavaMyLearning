package JavaBasics;

import java.util.HashMap;
import java.util.Hashtable;

public class HashMao {
    public static void main(String[] args){

        Hashtable map = new Hashtable();
        map.put(1,'a');
        map.put(2,'b');
        map.put(3,'c');
        System.out.println(map.get(1));
        if(map.containsKey(2)){
            System.out.println("Contains");
        }
        else{
            System.out.println("doesnt contains");
        }

        HashMap<Integer, String> ar = new HashMap<>();
        ar.put(1,"a");
        ar.put(2,"b");
        ar.put(3,"c");
        if(ar.containsValue("b")){
            System.out.println("Contains in ar");
        }
        else
        {
            System.out.println("Doesnt contains in ar");
        }


    }
}
