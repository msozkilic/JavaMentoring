package Gun19;

import java.util.Arrays;

public class JavaArraysMethod3 {
    public static void main(String[] args) {
        String[]names={"Ahmet","Ayse","Kaya","Deniz"};
        System.out.println(Arrays.toString(names));

       Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        int[] a={1,2,3};
        int[] b={1,2,3};
        int[] c={2,1,3};
        System.out.println(Arrays.equals(a,b));
        System.out.println(Arrays.equals(a,c));

        int[]numbers=new int[5];
        System.out.println("atamadan once degerler"+Arrays.toString(numbers));
        Arrays.fill(numbers,7);
        System.out.println("atamadan sonra degerler"+Arrays.toString(numbers));

        int[]rakamlar={2,7,4,7,8,12,6,3};
        System.out.println("once: 8in indexi i= "+Arrays.binarySearch(rakamlar,8));
        Arrays.sort(rakamlar);
        System.out.println("sonra :8in indexi "+Arrays.binarySearch(rakamlar,8));



    }
}
