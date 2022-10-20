package Gun18;

import java.util.Scanner;

public class JavaArray3 {
    public static void main(String[] args) {
    int[] dizi=new int[5];
    Scanner scanner=new Scanner(System.in);

    int toplam=0;
    for (int i = 0; i < dizi.length; i++) {
        System.out.print("Bir sayi giriniz :");
        dizi[i]=scanner.nextInt();
        toplam+=dizi[i];


    }
    int ort=toplam/dizi.length;
    int ortGecen=0;
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i]>ort)
                ortGecen++;

        }
        System.out.println(ortGecen);



    }
}
