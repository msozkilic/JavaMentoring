package Gun17;

import java.util.Scanner;

public class GununSorusu {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int randomSayi=(int)(Math.random()*10)+1;

        for (int i = 1; i <=3 ; i++) {
            System.out.println("Sayiyi tahmin ediniz :");
            int tahmin=scanner.nextInt();
            if(tahmin==randomSayi)
                System.out.println("Bildiniiz ,tebrikler");
            else
                System.out.println("malesef ,bulamadiniz");

        }

    }
}
