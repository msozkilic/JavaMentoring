package Gun10;

import java.util.Scanner;

public class javaIf7 {
    public static void main(String[] args) {
        //Onlar basamaginin tek mi cift mi oldugunu  bulunuz
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayi giriniz :");
        int sayi1 = scanner.nextInt();

        int onlar=(sayi1/10)%10;
        //int tekMi=sayi1/2==1;
        if(onlar/2==0){
            System.out.println("sayi cifttirr");
        }else
            System.out.println("tektir");

    }
}
