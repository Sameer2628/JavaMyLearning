package JavaBasics;

public class ClssObj {

   // String make;
   // int model;
    public static void main(String[] args){
       /* ClssObj name =new ClssObj();
        ClssObj name2= new ClssObj();
        ClssObj name3= new ClssObj();
        name.make ="Honda";
        name.model=2013;

        name2.make="Maruti";
        name2.model=2021;

        System.out.println(name.make +":"+name.model);
        System.out.println(name2.make + ":"+name2.model);
        name=name2;
        name3=name;
        System.out.println(name.make +":"+name.model);
        System.out.println(name3.make +":"+name3.model);*/
       ClssObj A=new ClssObj();
       A.add();
       A.sub(20,30);
        System.out.println("Multiplied Value is :"+A.mul(2,3));



    }

    public void add(){
        int a =10,b=20;
        System.out.println("Sum is :"+(a+b));
    }
    public void sub(int a,int b){
        int diff;
        diff=a-b;
        System.out.println("Difference is :"+diff);

    }
    public int mul(int a, int b){
        return a*b;
    }
            }