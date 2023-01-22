package JavaBasics;

import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.BitSet;
import java.util.Locale;
import java.util.Set;
import java.util.StringJoiner;

public class Revision {
    public static void main(String args[]) {

        int i = (char) +(byte) +(int) -(long) -1;
        System.out.println(i);
        System.out.println("/\"Hello\"/ and \"Welcome\"");
        StringJoiner joiner = new StringJoiner(",", "[", "]");
        joiner.add("a").add("b").add("c");
        System.out.println(joiner);
        String str = "Testing";
        Long k = str.chars().filter(e -> (char) e == 't' || (char) e == 'i').count();
        //Long w = str.chars().filter(e -> e == 't' || (char) e == 'i')
        Long L = str.chars().filter(value -> (char) value == 'a' || (char) value == 'e' || (char) value == 'i' || (char) value == 'o' || (char) value == 'u').count();
        System.out.println("Vowels are   :" + L);

        String s = "SameerKarekal";
        String s2 = "Sam";
        int count = 0;
        for (int m = 0; m < s.length(); m++) {
            if (Character.isUpperCase(s.charAt(m))) {
                count++;
            }
        }
        System.out.println("Total words are :" + count);
        System.out.println(s.matches(".*" + s2 + ".*"));
        String k1 = new BitSet() {{
            set(1, 101);
        }}.toString();
        String y;

        String z= "12345";
        Integer.parseInt(z);
        Runtime runtime = Runtime.getRuntime();
        try {
            Process exec = runtime.exec("notepad.exe");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(Math.random());
    }
}




