package Gun13;

import java.util.Scanner;

public class ifinif1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Sayi gir : ");
        int sayi=scanner.nextInt();

        if(sayi<100){
            System.out.println("100den kucuk");
        }if(sayi<50){
            System.out.println("50den kucuk");
        }if(sayi<25){
            System.out.println("25den kucuk");
        }

    }
}
