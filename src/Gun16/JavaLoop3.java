package Gun16;

import java.util.Scanner;

public class JavaLoop3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("bir sayi yaziniz :");
        int sayi=scanner.nextInt();

        int toplam=0;
        for (int i = 1; i <sayi ; i++) {
            toplam+=i;
            System.out.println(i);
            System.out.println(toplam);

        }System.out.println("toplam :"+toplam);
    }
}
