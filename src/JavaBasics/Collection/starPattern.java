package JavaBasics.Collection;

import org.jcp.xml.dsig.internal.dom.DOMSubTreeData;

public class starPattern {
    public static void main(String args[]){


        for(int i=5;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
            System.out.println((char)(65));
        }

    }

}
