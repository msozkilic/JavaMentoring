package Gun16;

import java.util.Scanner;

public class JavaForLoop4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("bir sayi yaziniz :");
        int sayi=scanner.nextInt();

        int faktoriyel=1;
        for (int i = 1; i <=sayi ; i++) {
             faktoriyel=faktoriyel*i;


        }  System.out.println(faktoriyel);



    }
}
