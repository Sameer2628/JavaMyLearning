package JavaBasics.Collection;

public class Singleton {

    private static Singleton singleton = null;
    private String str;

    private Singleton(){
        str="HI Welcome to Singleton";
    }

    private static Singleton getInstance(){

        if(singleton==null){
            singleton = new Singleton();
        }
        return  singleton;
    }

    public static void main(String[] args){
        Singleton x= Singleton.getInstance();
        Singleton y= Singleton.getInstance();

    }
}
