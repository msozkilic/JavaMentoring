package PROJE1;

import java.util.Scanner;

public class CiftSayi {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Bir sayi giriniz :");
        int sayi = scanner.nextInt();

        int sayac=0;
        int ciftSayi;

        do {
            sayac+=2;
            System.out.println(sayac);

        }while (sayac<sayi);

        }


        }


