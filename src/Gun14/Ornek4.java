package Gun14;

import java.util.Scanner;

public class Ornek4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayi gir : ");
        int girilensayi = scanner.nextInt();

        int toplam=0;
        while (girilensayi>0){
            toplam=toplam+girilensayi;
            girilensayi--;

        }
        System.out.println(toplam);
    }
}



