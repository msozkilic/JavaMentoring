package Gun14;

import java.util.Scanner;

public class doWhile8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int sayi;
        do{
         System.out.println("Sayi gir :");
         sayi=scanner.nextInt();
        }while (sayi!=0);
    }
}
