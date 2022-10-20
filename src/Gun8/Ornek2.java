package Gun8;

import java.util.Scanner;

public class Ornek2 {
    public static void main(String[] args) {
        //todo Kullanicidan alinan stirngde bosluk olup olmadigini kontrol
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ad ve Soyadiniz :");
        String adSoyad=scanner.nextLine();

        String bosluk=" ";
        boolean boslukVarMi=adSoyad.equalsIgnoreCase(bosluk);
        System.out.println("Bosluk var mi :"+boslukVarMi);

    }
}
