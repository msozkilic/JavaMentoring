package PROJE1;

import java.util.Scanner;

public class RandomSayi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayi giriniz :");
        int sayi = scanner.nextInt();

        int randomSayi=(int)(Math.random()*sayi+1);
        System.out.println(randomSayi);
    }
}
