package JavaBasics;

public class overrloading {

    int age=10;
    static int salary =25;
    public static void main(String[] args){
        overrloading obj =new overrloading();
        salary =50;
        System.out.println("Salary is :"+(salary+5));
        add(salary,obj.age);
        obj.add(salary,obj.age,5);
       // obj.add(5,5);
       // obj.add(5,5,5);


    }
    public static void add(int i, int j){
        System.out.println("Sum is :"+(i+j));
    }
    public void add(int i, int j, int k){
        System.out.println("Sum is :"+(i+j+k));
    }
}
