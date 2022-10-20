package Gun14;

import java.util.Scanner;

public class DoWhile9 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String kelime="";

        do{
            System.out.println("program calisiyor");
            System.out.println("Bir kelime giriniz :");
            kelime=scanner.nextLine();

        }while (!kelime.equalsIgnoreCase("x"));
        System.out.println("program bitti");
    }
}
