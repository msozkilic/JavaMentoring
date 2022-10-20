package PROJE2.src;

import java.util.Scanner;

public class sameFirstAndLast {
    /*

    Bir int array verildiğinde, array uzunluğu 1 veya daha fazlaysa ve ilk öğe ile son öğe eşitse true değerini yazdırın.

    sameFirstLast([1, 2, 3]) → false
    sameFirstLast([1, 2, 3, 1]) → true
    sameFirstLast([1, 2, 1]) → true
    sameFirstLast([1]) → true

    sadece  true veya false print et

    */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String myStr = scan.nextLine();

        String[] useThisArray = myStr.split(" ");

        int[] arr=new int[3];
        for (int i = 0; i < 3; i++) {
            int num=Integer.parseInt(useThisArray[i]);
            arr[i]=num;

            if(arr[0] == arr.length-1 && arr.length>=1)
                System.out.println("true");
            else
                System.out.println("false");


        }
        System.out.println();

      //        code start here

      // Koda burdan başlayin




    }


}
