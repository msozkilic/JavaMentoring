package Gun7;

import java.util.Scanner;

public class Ornek3 {
    public static void main(String[] args) {
        String text="Merhaba Arkadaslar";

        System.out.println(text.substring(4));
        System.out.println(text.substring(7));
        System.out.println(text.substring(4,8));

        //Ad ve soyadi ilk harflerini A.Y. seklinde yazdiriniz: Ahmet Altan
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ad ve Soyadiniz : ");
        String adSoyad=scanner.nextLine();
        //String ilkHarfler=adSoyad.substring(0,1);

        char adIlkHarf=adSoyad.charAt(0);
        int boslukNerde=adSoyad.indexOf(" ");
        char soyadIlkHarf=adSoyad.charAt(boslukNerde+1);


        System.out.println(adIlkHarf+"."+soyadIlkHarf);



    }
}
