package PROJE1;

import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayi giriniz :");
        int sayi = scanner.nextInt();

        boolean tek=true;

        if(sayi%2==1)
            System.out.println("sayi tektir "+tek);
        else
            System.out.println("cifttir :"+ false);
    }
}
