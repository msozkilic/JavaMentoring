package Gun10;

import java.util.Scanner;

public class javaIf3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Bir sayi giriniz :");
        int sayi1=scanner.nextInt();
        System.out.println("Bir sayi giriniz :");
        int sayi2=scanner.nextInt();

        if(sayi1>sayi2){
            System.out.println("sayi1 buyuktur");
        }else if(sayi2>sayi1){
            System.out.println("sayi 2 buyuktur");
        }else {
            System.out.println("esittir");
        }

    }
}
