package JavaBasics;

import java.util.ArrayList;

public class ArrayList_HashMap {
    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>();
        int j = 100;
        ar.add(120);
        ar.add(100);
        ar.add(300);
        ar.add(60);
       // ar.add("Sameer");
        ar.add(10);

        if(ar.contains(60))
        {
            System.out.println("Contains");
        }
        else
        {
            System.out.println("Doesnt Contains");
        }
        System.out.println("size is :"+ar.size());
        for (int i = 0; i < ar.size(); i++) {
            if (ar.get(i).equals(j)) {
                System.out.println("Match  Found for " + ar.get(i) + " at position: "+i);
                break;
            }
            else
            {
                System.out.println("Match not found");
            }
        }
           for (Integer i :ar)
                  {
                      System.out.println(i);
                      if(i.equals(j)) {
                          System.out.println("Match  Found for "+i );
                            break;
                      }


                  }/*
                       /*else{
                System.out.println("NO Match");
            }*/

    }

}

