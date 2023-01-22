package JavaBasics.Collection;

import java.util.HashMap;
import java.util.Map;

public class numCount {

    public static  void getcount(long Num){

        HashMap<Long, Integer> digitMap = new HashMap<Long, Integer>();
        while(Num!=0){

            Long LastDigit = Num%10;
            if(digitMap.containsKey(LastDigit)){
                digitMap.put(LastDigit,digitMap.get(LastDigit)+1);
            }
            else {
                digitMap.put(LastDigit,1);
            }
          Num=Num/10;
        }
        for (Map.Entry<Long, Integer>   e :   digitMap.entrySet()){
            System.out.println("Number :"+e.getKey() +" : Repeated Value is :"+e.getValue());
        }

    }
    public static void main(String args[]){
        getcount(122);
    }
}
