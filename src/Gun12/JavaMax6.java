package Gun12;

import java.util.Scanner;

public class JavaMax6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("bir sayi gir : ");
        int sayi1=scanner.nextInt();
        System.out.println("bir sayi gir : ");
        int sayi2=scanner.nextInt();
        System.out.println("bir sayi gir : ");
        int sayi3=scanner.nextInt();

        System.out.println("en buyuk : "+ Math.max(Math.max(sayi1,sayi2),sayi3));
    }
}
