package Gun16;

import java.util.Scanner;

public class JavaContiniueStatemnt8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int toplam=0;

        for (int i = 0; i <5 ; i++) {
            System.out.println("Bir adet sayi giriniz : ");
            int sayi=scanner.nextInt();

            if(sayi>5 && sayi<10 )
                continue;
            toplam+=sayi;
        }
        System.out.println("Toplam :"+ toplam);
    }
}
