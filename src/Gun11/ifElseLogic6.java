package Gun11;

import java.util.Scanner;

public class ifElseLogic6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayi giriniz :");
        String password = scanner.nextLine();

        if(password.length()>=8 && !password.contains("pass") && password.length()<=12){
            System.out.println("dogru");

        }else
            System.out.println("gecersiz");

    }
}
