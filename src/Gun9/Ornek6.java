package Gun9;

import java.util.Scanner;

public class Ornek6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Bir sayi giriniz : ");
        int sayi=scanner.nextInt(); // todo 751

        int birler=sayi%10; //birler basamagi
        int onlar=(sayi/10)%10;//onlar basamagi
        int yuzler=sayi/100;  //yuzler basamagi

        System.out.println(birler);
        System.out.println(onlar);
        System.out.println(yuzler);

        int tersi=birler*100 +onlar*10 +yuzler;
        System.out.println(tersi);

        //todo 2020 ye kadar gecen gun miktari
        int gecenGun=(2020*365)+(2020/4);
        System.out.println( gecenGun);






    }
}
