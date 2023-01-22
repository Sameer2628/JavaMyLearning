package JavaBasics;

import java.util.Arrays;

public class TwoDimensional {

    public static void main(String[] args){
        String a[][]=new String[2][2];
        a[0][0]="A";
        a[0][1]="B";
        a[1][0]="C";
        a[1][1]="D";
        System.out.println(a.length);
        System.out.println(a[0].length);
        for(int row=0;row<a.length;row++){
            for(int col=0;col<a[0].length;col++){
                System.out.println(a[row][col]);
            }
        }

        int TD[][]=new int[4][2];
        TD[0][0]=22;
        TD[0][1]=32;
        TD[1][0]=42;
        TD[1][1]=52;
        System.out.println("Length of integer arrray is :"+ Arrays.stream(TD).count());
    }
}
