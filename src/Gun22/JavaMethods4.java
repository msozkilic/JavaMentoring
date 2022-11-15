package Gun22;

import java.util.Arrays;
import java.util.Scanner;

public class JavaMethods4 {
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);
        System.out.println("Sayilari bir bosluk birakarak yan yana giriniz=");
        String strTumsayilar = oku.nextLine();

        String[] strDizi = strTumsayilar.split(" ");
        int[] intDizi = new int[strDizi.length];

        for (int i = 0; i < strDizi.length; i++) {
            intDizi[i] = Integer.parseInt(strDizi[i]);

        }
        System.out.println(Arrays.toString(intDizi));

        enBuyukYaz(intDizi);
        enKucukYaz(intDizi);
        tumTopla(intDizi);
        ortalamaYaz(intDizi);


    }

    public static void enBuyukYaz(int[] dizi) {
        Arrays.sort(dizi);
        System.out.println("En buyuk " + dizi[dizi.length - 1]);

    }

    public static void enKucukYaz(int[] dizi) {
        Arrays.sort(dizi);
        System.out.println("En kucuk " + dizi[0]);

    }

    public static void tumTopla(int[] dizi) {
        int toplam = 0;
        for (int i = 0; i < dizi.length; i++) {
            toplam += dizi[i];

        }
        System.out.println("toplam =" + toplam);


    }

    public static void ortalamaYaz(int[] dizi) {
        int toplam = 0;
        for (int i = 0; i < dizi.length; i++) {
            toplam += dizi[i];

        }
        System.out.println("ortalama =" + toplam/dizi.length);
    }

}
