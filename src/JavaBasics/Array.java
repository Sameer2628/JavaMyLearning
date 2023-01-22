package JavaBasics;

public class Array {
    public static void main(String[] args){
        int a[]=new int[5];
        a[0]=10;
        a[1]=20;
        a[2]=30;
        a[3]=40;
        a[4]=50;
        System.out.println("First array is:");
        for(int i=0;i<a.length; i++)
            System.out.println(+a[i]);
        System.out.println("End of First array is:");

        char c[]=new char[3];
        c[0]='a';
        c[1]=10;
        c[2]='c';
        for(int j=0;j<=c.length-1;j++) {
            System.out.println(c[j]);
        }

        boolean b[] =new boolean[2];
        b[0]=true;
        b[1]=false;
        System.out.println(b[0]);

        Object obj[]=new Object[4];
        obj[0]=1;
        obj[1]=2.2;
        obj[3]="SAm";
        obj[2]="SAm";
//obj[4]=34;
        for(int k=0;k<=obj.length-1;k++){
            System.out.println(obj[k]);

        }

    }
}
