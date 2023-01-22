package JavaBasics;

public class Student {
    int id;
    String name;

    void display(){

        System.out.println("name"+name);
    }

    public static void main(String args[]){

        Student s1= new Student();
        s1.name="Testing";
        s1.display();

    }
}
