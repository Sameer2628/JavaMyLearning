package JavaBasics.Collection;

import java.util.HashMap;
import java.util.Map;

public class PrintDuplicate {

    public static void main(String args[]) {
        System.out.println("Hello");
        String test = "Java";
        char words[] = test.toCharArray();
        Map<Character, Integer> mp = new HashMap<Character, Integer>();
        for (Character c : words) {
            System.out.println("Comparing chars is "+c);
            if (mp.containsKey(c)) {
                mp.put(c, mp.get(c) + 1);
            } else {
                mp.put(c, 1);
            }
        }
        System.out.println(mp);

        for (Map.Entry<Character,Integer> entrySet : mp.entrySet()) {
            //if(entrySet.getValue()>1)
            System.out.println("Character is :"+entrySet.getKey()+ "      Its count is :"+entrySet.getValue());

        }

    }
}
