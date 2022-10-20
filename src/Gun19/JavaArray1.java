package Gun19;

import java.io.OptionalDataException;
import java.util.Scanner;

public class JavaArray1 {
    public static void main(String[] args) {
        int[] dizi=new int[5];
        Scanner oku=new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Bir sayi giriniz :");
            dizi[i]=oku.nextInt();
        }
        for (int i = dizi.length-1; i >=0 ; i--) {
            System.out.print(dizi[i]);

        }

    }
}

