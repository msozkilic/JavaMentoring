package Gun16;

import java.util.Scanner;

public class JavaContinueStatement {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Bir kelime giriniz :");
        String cumle=scanner.nextLine();

        for (int i = 0; i <cumle.length() ; i++) {
            if(cumle.charAt(i)==' ' ||cumle.charAt(i)=='a')
                continue;
            System.out.println(cumle.charAt(i));

        }
    }
}
