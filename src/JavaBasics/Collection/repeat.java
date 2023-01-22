package JavaBasics.Collection;

public class repeat {
    public static void print(String Name,int num){
        if(num<=5){
            System.out.println(Name);
            num++;
            print(Name,num);
        }
    }
    public static void main(String args[]){
        print("Sam",1);
    }
}
