package Gun12;

import java.util.Scanner;

public class JavaRandom7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("ust deger gir : ");
        int max=scanner.nextInt();
        System.out.println("alt deger gir : ");
        int min=scanner.nextInt();

        int ruetilen=(int)(Math.random()*((max-min)+1))+min;

        System.out.println(ruetilen);

    }
}
