package Gun13;

import java.util.Scanner;

public class Switch5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayi gir : ");
        int sayi = scanner.nextInt();

        int onlar=(sayi/10)%10;


        switch (onlar){
            case 1: System.out.println("Bir"); break;
            case 2: System.out.println("iki"); break;
            case 3: System.out.println("uc"); break;
            case 4: System.out.println("dort"); break;
            case 5: System.out.println("Bes"); break;
            case 6: System.out.println("Alti"); break;
            case 7: System.out.println("Yedi"); break;
            case 8: System.out.println("Sekiz"); break;
            case 9: System.out.println("Dokuz"); break;
            case 0: System.out.println("Sifir"); break;


        }
    }
}
