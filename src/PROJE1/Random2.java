package PROJE1;

import java.util.Scanner;

public class Random2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayi giriniz :");
        int sayi = scanner.nextInt();
        System.out.println("Bir sayi giriniz :");
        int sayi2 = scanner.nextInt();

        int randomS=(int)((Math.random()*(sayi-sayi2)+1))+sayi2;
        System.out.println(randomS);
    }
}
