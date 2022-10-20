package PROJE2.src;

import java.util.Arrays;
import java.util.Scanner;

public class changeArray {
    /*
       String bir array verildiğinde

       Eger String Orange içeriyorsa bütün  Orange leri Apple  çevir

       Örnek:

       Array : Peach , Berry , Orange , WaterMelon , Orange

       Result böyle olmalı --> : Peach , Berry , Apple , WaterMelon , Apple

       Arrayi print edin

     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String myStr = scan.nextLine();
        String[] UseThisArray = myStr.split(" ");

        for (int i = 0; i < UseThisArray.length; i++) {
            if(UseThisArray[i].contains("Orange"))
                System.out.println(UseThisArray[i].replace("Orange","Applee"));

        }

//        Koda burdan başla
//        kullanman gereken -> UseThisArray



    }
}