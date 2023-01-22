package JavaBasics.Collection;

import java.util.Arrays;

public class arrayStor {
    public static void rev(int num) {
        if (num < 10) {
            System.out.print(num);
            return;
        } else {
            System.out.print(num % 10);
            rev(num / 10);
        }
    }

    public static void isnum(String num){
        try{
            Long.parseLong(num);
            System.out.println("valid number");
        }
        catch(NumberFormatException E){
            E.printStackTrace();
            System.out.println("Not a valid number");
        }
        }
        public static void checknum(String num){
           if(num.matches("[0-9]{10}")){
               System.out.println("Valid nUm");
           }
           else{
               System.out.println("Not a valid phone num");
           }
        }


    public static void main(String args[]) {
        rev(123);
        int num1 = 2345;
        while (num1 > 10) {
            // = num1 % 10;
            System.out.println(num1%10);
            num1 = num1 / 10;

        }
        System.out.println(num1);
        isnum("123");
        checknum("1232122345");
        checknum("12345678912");

    }
}