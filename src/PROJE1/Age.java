package PROJE1;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Yasinizi giriniz :");
        int age=scanner.nextInt();

        if(age<=10){
            System.out.println("Facebook hesabi acmak icin cok gencsin");
        }else if(age<=16){
            System.out.println("Ehliyet almak icin cok gencsin");
        }else if(age<=18){
            System.out.println("Dovme yaptirmak icin cok gencsin");
        }else if(age>=21){
            System.out.println("Istedigini yapabilirsin");
        }
    }
}
