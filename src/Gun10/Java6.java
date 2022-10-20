package Gun10;

import java.util.Scanner;

public class Java6 {
    public static void main(String[] args) {

        //Sayi tek mi cift mi
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayi giriniz :");
        int sayi1 = scanner.nextInt();
        System.out.println("Bir sayi giriniz :");
        int sayi2 = scanner.nextInt();
        System.out.println("Bir sayi giriniz :");
        int sayi3 = scanner.nextInt();

        int enBuyuk=sayi1;

        if(enBuyuk>sayi2){
            System.out.println("enbuyuk sayi sayi1");
        }if(sayi2>sayi3){
            System.out.println("sayi2 en buyuk");
        }if(sayi3>sayi1){
            System.out.println("sayi3 en buyuk");
        }

    }
}
