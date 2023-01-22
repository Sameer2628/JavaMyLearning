package JavaBasics.Collection;

import java.nio.charset.StandardCharsets;
import java.sql.SQLOutput;

public class StringTest {

    public static void test(int a){
        System.out.println(a);
    }
    public static void test(int a, int b){
        System.out.println(""+a+"&"+ b);
    }

    public static void print(int i){
        if(i<=100){
            System.out.println(i);
            i++;
            print(i);
        }
    }

    public static void main(String[] args){

        test(5,6);

        if(System.out.printf(" ")==null){

        }
        print(1);

        //String Split
       /*String s= "123-456";
       String y="    HI    hOw      you       ";
       String[] j = s.split("-");
        System.out.println("total split words:"+j.length);
        System.out.println(j[0] );
        System.out.println(j[1] );
        System.out.println(y.trim());
        System.out.println(y.replace(" ","")); */

        //String Reverse with and without String Builder
        /* String test = "ABC";
        String newstring= "";
        StringBuilder newstring1 =new StringBuilder();
        newstring1.append(test);
        System.out.println("reverse using sstirng builder:"+newstring1.reverse());
        char c;
        System.out.println(test);
        for(int i=0;i<test.length();i++){
            c=test.charAt(i);
            newstring=c+newstring;
        }
        System.out.println("String reverse using normal Method:"+newstring);*/
    }
}
