package JavaBasics.Collection;

import java.awt.*;
import java.text.BreakIterator;

public class Question {
    public static void main(String[] args){
        int i=5;
        int j;
        restart:

         j= prin(i);
         repeat:
         if(j<i){
            prin(j);
            //continue repeat;
         }

    }
    public static int prin(int i){
        System.out.println("HI");
        return i--;


    }

}
