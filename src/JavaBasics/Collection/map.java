package JavaBasics.Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class map {
    public static void main(String[] args){

        List<Map> lt= new ArrayList<>();

        for(int i=1;i<=2;i++) {
            Map<String, Integer> mp= new HashMap<String, Integer>();
            mp.put("Store", i);
            mp.put("Divison", 32+i);
            lt.add(mp);
        }
        System.out.println(lt);
       for(Map<String, Integer> lt1:lt){
           System.out.println(lt1.get("Store"));

       }
    }
}
