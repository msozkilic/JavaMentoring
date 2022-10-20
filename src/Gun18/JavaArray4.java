package Gun18;

import java.util.Arrays;
import java.util.Scanner;

public class JavaArray4 {
    public static void main(String[] args) {
        int[] array=new int[7];

        Scanner scanner=new Scanner(System.in);

        int tek=0;
        for (int i = 0; i <array.length; i++) {
            System.out.print("Bir sayi giriniz :");
            array[i]=scanner.nextInt();

            System.out.print(Arrays.toString(array));
            if (array[i]%2==1)
                tek++;

        }
        System.out.println(tek
        );
    }
}
