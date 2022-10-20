package Gun9;

import java.util.Scanner;

public class Ornek1 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Adiniz ve Soyad");
        String adSoyad = scanner.nextLine();

        int bosluk = adSoyad.indexOf(" ");
        String ilkAd = adSoyad.substring(0).toLowerCase();
        String soyAD = adSoyad.substring(bosluk + 1).toLowerCase();

        System.out.println(ilkAd + soyAD);
    }
}
