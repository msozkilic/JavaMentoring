package Gun8;

import java.util.Scanner;

public class Ornek {
    public static void main(String[] args) {
        //Kullanicidan tek seferde alacaginiz 2 kelimelik ad ve soyadi ayri ayri yazdiriniz
        //todo Ahmet Beyaz

        Scanner scanner=new Scanner(System.in);
        System.out.println("Ad ve Soyadiniz :");
        String adSoyad=scanner.nextLine();

        int bosluk=adSoyad.indexOf(" ");
        String ad=adSoyad.substring(0,bosluk);
        String soyad=adSoyad.substring(bosluk+1);

        System.out.println("AD :" + ad);
        System.out.println("Soyad :"+ soyad);

        //todo Kullanicidan alacaginiz 3 ismi Ayri ayri yazdiriniz
        Scanner scan=new Scanner(System.in);
        System.out.println("Ad ve Soyadiniz :");
        String adSoy=scan.nextLine();

        int ilkBosluk=adSoy.indexOf(" ");
        int sonBosluk= adSoy.lastIndexOf(" ");
        String ilkAd= adSoy.substring(0,ilkBosluk);
        String ikinciAd= adSoy.substring(ilkBosluk+1,sonBosluk);
        String soyadi= adSoy.substring(sonBosluk+1);

        System.out.println(ilkAd+"\n"+ikinciAd+"\n"+soyad);





    }
}
