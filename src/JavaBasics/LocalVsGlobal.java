package JavaBasics;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

import java.sql.SQLOutput;

public class LocalVsGlobal {
    int age =25;
    String name ="John";

    public static void main(String[] args){
        int i=10;
        LocalVsGlobal a = new LocalVsGlobal();
        System.out.println("Globla value of age is :"+a.age);
        System.out.println("Global value of name is :"+a.name);
        System.out.println("Local value of i is :"+i);
        a.sum();

    }
    public void sum(){
        int i=20;
        int j=30;
        int k= i+j;
        System.out.println("Sum is :"+k);
    }

}
