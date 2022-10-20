package Gun10;

import java.util.Scanner;

public class JavaIf1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Bir sayi giriniz :");
        int sayi=scanner.nextInt();

        if(sayi>10){
            System.out.println("10dan buyuk");
        }else{
            System.out.println("degil");
        }

    }
}
