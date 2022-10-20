package Gun10;

import java.util.Scanner;

public class javaIf5 {
    public static void main(String[] args) {
        //Birler basamagini yazi ile yazdiriniz
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayi giriniz :");
        int sayi1 = scanner.nextInt();

        String yazi=Integer.toString(sayi1%10);
        System.out.println(yazi);

    }
}
