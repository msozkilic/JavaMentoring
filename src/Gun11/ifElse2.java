package Gun11;

import java.util.Scanner;

public class ifElse2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayi giriniz :");
        int vizeOrt = scanner.nextInt();
        System.out.println("Bir sayi giriniz :");
        int finalOrt = scanner.nextInt();

        double ortalama=vizeOrt*0.4+finalOrt*0.6;

        if(ortalama>=60){
            System.out.println("Gectiniz");
        }else
            System.out.println("Kaldiniz");



    }
}
