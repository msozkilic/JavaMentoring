package Gun11;

import java.util.Scanner;

public class ifElseifLogic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayi giriniz :");
        String soyle=scanner.nextLine();

        if(soyle.length()>10 && soyle.contains("study")){
            System.out.println("evet");
        }else
            System.out.println("hayir");


    }
}