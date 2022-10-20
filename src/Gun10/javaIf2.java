package Gun10;

import java.util.Scanner;

public class javaIf2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Bir sayi giriniz :");
        int sayi=scanner.nextInt();

        if(sayi>0){
            System.out.println("Sayi pozitif");
        }else{
            System.out.println("Negatif");
        }

    }
}
