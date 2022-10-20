package PROJE2.src;

import java.util.Arrays;
import java.util.Scanner;

public class reverseArr {
    /*

          Verilen String array

         String arrayi ters çevir

         ters arrayi yazdır

       NOT:
       Arrays.toString(your_array_name);  <--- kullanın

     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String myStr = scan.nextLine();

        String[] useThisArray = myStr.split(" ");

        for (int i = useThisArray.length-1; i >=0 ; i--) {
            System.out.println(useThisArray[i]);

        }



        }
    }







     //        code start here

     //        Koda burdan başlayın















