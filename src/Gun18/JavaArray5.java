package Gun18;

import java.util.Arrays;

public class JavaArray5 {
    public static void main(String[] args) {
        int[] array=new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i]=(int)(Math.random()*9)+1;
            System.out.println(array[i]);
        }System.out.println(Arrays.toString(array));

        for (int deger:array
             ) {
            System.out.println(deger);

        }


    }
}
