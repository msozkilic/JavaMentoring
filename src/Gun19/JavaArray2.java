package Gun19;

import java.util.Arrays;
import java.util.Scanner;

public class JavaArray2 {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        String[] meyveler = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Meyve adi :");
            meyveler[i] = oku.nextLine();
        }
        System.out.println(Arrays.toString(meyveler));
        for (int i = 0; i < 5; i++) {
            if (meyveler[i].equalsIgnoreCase("elma"))
                System.out.println(meyveler[i]);

            if (meyveler[i].toLowerCase().contains("elma"))
                System.out.println(meyveler[i]);
        }
    }
}








