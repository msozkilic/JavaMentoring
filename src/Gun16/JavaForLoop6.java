package Gun16;

import javax.swing.*;
import java.util.Scanner;

public class JavaForLoop6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Bir kelime giriniz :");
        String cumle=scanner.nextLine();

        int miktar=0;
        for (int i = 0; i <cumle.length() ; i++) {
            if(cumle.charAt(i)=='a')
                miktar++;
            else if (cumle.charAt(i)=='c')
                break;
            System.out.println(cumle.charAt(i));

        }
        System.out.println("a harfinin miktari :"+miktar);
    }

}
