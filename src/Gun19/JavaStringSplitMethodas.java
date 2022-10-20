package Gun19;

import java.util.Arrays;
import java.util.Scanner;

public class JavaStringSplitMethodas {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Bir cumle girinz :");

        String cumle=scanner.nextLine();
        String[] kelime=cumle.split(" ");

        for (int i = 0; i < kelime.length; i++) {
            System.out.println(kelime[i]);

        }
        for (String value:kelime
             ) {
            System.out.println(value);

        }
    }
}
