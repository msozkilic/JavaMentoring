package Gun14;

import java.util.Scanner;

public class Ornek5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayi gir : ");
        int girilensayi = scanner.nextInt();

        while (girilensayi>0){
            if(girilensayi%2==1){
                System.out.println(girilensayi); }
            girilensayi--;

        }
    }
}
