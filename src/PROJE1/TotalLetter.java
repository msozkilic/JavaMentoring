package PROJE1;

import java.util.Scanner;

public class TotalLetter {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Bir kelime giriniz :");
        String kelime1=scanner.next();

        int uzunluk=kelime1.length();
        int tekMi=uzunluk%2;
        boolean tek=true;

        if(tekMi==1)
            System.out.println("Tektir "+tek);
        else
            System.out.println("cifttir "+ false);
    }
}
