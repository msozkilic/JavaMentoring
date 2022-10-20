package Gun11;

import java.util.Scanner;

public class ifElseIf4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayi giriniz :");
        int sayi1 = scanner.nextInt();


        if(sayi1>0){
            System.out.println("pozitif");

        }else if(sayi1<0){
            System.out.println("negatif");
        }else
            System.out.println("sayi 0");
    }
}
