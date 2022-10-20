package PROJE1;

import java.util.Scanner;

public class TwoString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Bir kelime giriniz :");
        String kelime1=scanner.next();
        System.out.println("Bir kelime giriniz :");
        String kelime2=scanner.next();

        //todo Cat Chat

        int uzun=kelime1.length()-1;
        char son=kelime1.charAt(uzun);

        char ilk=kelime2.charAt(0);

        if(son==ilk)
            System.out.println(kelime1.substring(0).concat(kelime2.substring(1)));
        else
            System.out.println(kelime1 +kelime2);

    }
}
