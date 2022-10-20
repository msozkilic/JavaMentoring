package Gun11;

import java.util.Scanner;

public class ifElse3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayi giriniz :");
        int sayi= scanner.nextInt();

        if(sayi%2==0){
            System.out.println("cifttir");
        }else
            System.out.println("Tektir");
    }
}
