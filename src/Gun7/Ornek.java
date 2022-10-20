package Gun7;

import java.util.Scanner;

public class Ornek {
    public static void main(String[] args) {

        String kelime="Merhaba Dünya";
        char harf=kelime.charAt(3);
        System.out.println(harf);
        int harff=kelime.indexOf('e');
        System.out.println(harff);

        // KELIMENIN SON HARFINI BULMA
        Scanner scanner=new Scanner(System.in);
        System.out.println("Bir kelime giriniz");
        String kelime1=scanner.nextLine();

        int uzunluk=kelime1.length();
        System.out.println(uzunluk);
        char sonK=kelime1.charAt(uzunluk-1);
        System.out.println(sonK);
        System.out.println(kelime1.charAt(kelime1.length()-1)); //2.Yol

        String s="Hi";
        System.out.println(s+"there");
        System.out.println(s.concat("there"));
        String s2="Everybody";
        System.out.println(s.concat(s2));

    }
}
