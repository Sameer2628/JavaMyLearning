package JavaBasics;

public class typeCast {

    public static void main(String[] args){
        int a =12;
        String b="13";
        System.out.println(a+Double.parseDouble(b));
        b= String.valueOf(a);
        System.out.println(b);
        System.out.println(a+Integer.parseInt(b));
    }
}
