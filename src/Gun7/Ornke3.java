package Gun7;

import java.util.Scanner;

public class Ornke3 {
    public static void main(String[] args) {
        //todo 3 kelimelik ismi A.D.Y seklinde yazdiriniz

        Scanner scanner=new Scanner(System.in);
        System.out.println("Ad ve Soyadiniz : ");
        String adSoyad=scanner.nextLine();

        char ilkHarf=adSoyad.charAt(0);
        int ilkBosluk=adSoyad.indexOf(" ");
        char ikinciHarf=adSoyad.charAt(ilkBosluk+1);
        int ikinciBosluk=adSoyad.lastIndexOf(" ");
        char ucuncuHarf=adSoyad.charAt(ikinciBosluk+1);

        System.out.println(ilkHarf+"."+ikinciHarf+"."+ucuncuHarf);
    }
}
