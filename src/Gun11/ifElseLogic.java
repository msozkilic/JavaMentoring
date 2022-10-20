package Gun11;

import java.util.Scanner;

public class ifElseLogic {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Bir sayi giriniz :");
            int sayi1 = scanner.nextInt();

            if(sayi1<=2){
                System.out.println("5 ");
            }else if(sayi1<=5){
                System.out.println("10");
            }else
                System.out.println("15");
    }
}
