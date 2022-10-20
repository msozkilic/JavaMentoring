package PROJE1;

import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir kelime giriniz :");
        String kelime = scanner.nextLine();
        char bHarf='b';

        //todo GUVENEBILIRSIN
        for (int i = 0; i <kelime.length() ; i++) {
            if(kelime.charAt(i)==bHarf)

                System.out.println(i+".defa"+bHarf);

        }

    }
}


