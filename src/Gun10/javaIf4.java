package Gun10;

import java.util.Scanner;

public class javaIf4 {
    public static void main(String[] args) {

        //Sayi tek mi cift mi
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayi giriniz :");
        int sayi1 = scanner.nextInt();


        if(sayi1%2==1){
            System.out.println("Sayi tektir");
        }else {
            System.out.println("sayi cifttir");
        }
    }
}
