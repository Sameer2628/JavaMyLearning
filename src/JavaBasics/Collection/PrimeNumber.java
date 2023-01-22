package JavaBasics.Collection;

public class PrimeNumber {

    public static boolean isPrime(int num){
        if(num<=1){
            return false;
        }
        for(int i=2; i<num; i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }

    public static void printPrime(int num){
        for(int i=2; i<=num;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }


    public static void main(String[] args){
        int num=20;
        //System.out.println(num+" is "+isPrime(num));
        printPrime(num);
    }


}
