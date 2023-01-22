package JavaBasics.Collection;

import java.sql.SQLOutput;

public class FinalChap2 extends FinalChap{
    public FinalChap2(int i){
       // super(i);
        // super(i);
        System.out.println("Child Constructor");
    }
  /*  public FinalChap2(int i){
        System.out.println("Child Constructorer:"+i);

    }*/

    public static  void main(String[] args){
        FinalChap2 obj = new FinalChap2(10);
    }
}
