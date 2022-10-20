package Gun14;

import java.util.Scanner;

public class Ornek6 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        int sayac=1;
        int enb=0;
        while (sayac<=5){
            System.out.println("Bir sayi giriniz :");
            int sayi=scanner.nextInt();
            enb=Math.max(enb,sayi);
            sayac++;
        }
        System.out.println("en buyuk :"+enb);


        }



    }


