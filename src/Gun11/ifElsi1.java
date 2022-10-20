package Gun11;

import java.util.Scanner;

public class ifElsi1 {
    public static void main(String[] args) {
        //not 50den  buyukse gectiniz
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayi giriniz :");
        int not = scanner.nextInt();

        if(not>=50){
            System.out.println("Gectiniz");

        }else
            System.out.println("kaldiniz");

    }
}
