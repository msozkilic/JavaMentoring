package Gun11;

import java.util.Scanner;

public class ifElseLogic8 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Bir sayi giriniz : ");
            int sayi1 = scanner.nextInt();
            System.out.println("Bir sayi giriniz : ");
            int sayi2 = scanner.nextInt();
            System.out.println("islem seciniz ");
            String sec= scanner.next();

            if(sec.equalsIgnoreCase("t")){
                System.out.println(sayi1+sayi2);
            }else if(sec.equalsIgnoreCase("c")){
                System.out.println(sayi1-sayi2);
            }else if (sec.equalsIgnoreCase("p")){
                System.out.println(sayi1*sayi2);
            }else if(sec.equalsIgnoreCase("B")){
                System.out.println(sayi1/sayi2);
            }

    }
}
