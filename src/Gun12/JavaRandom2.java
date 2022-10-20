package Gun12;

import java.util.Scanner;

public class JavaRandom2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("sayi gir : ");
        int kacaKadarRandomSayi=scanner.nextInt();

        int uretilen=(int)(Math.random()*kacaKadarRandomSayi+1);

        System.out.println("tahmin et");
        int tahmin=scanner.nextInt();

        if(uretilen==tahmin){
            System.out.println("bildiniz");
        }else
            System.out.println("Bilemedin");
        System.out.println("uretilen "+ uretilen);

    }
}
