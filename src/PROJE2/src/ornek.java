package PROJE2.src;

import java.util.Scanner;

public class ornek {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String myStr=scanner.nextLine();
        String[]arr=myStr.split(" ");

        int[]myArr=new int[5];
        for (int i = 0; i < arr.length; i++) {
            int num=Integer.parseInt(arr[i]);
            myArr[i]=num;

        }
        int[]array1=new int[3];
        int[]array2=new int[2];

        for (int i = 0; i < 3; i++) {
            array1[i]=myArr[i];
        }
        for (int i = 3; i < 5; i++) {
            array2[i]=myArr[i];

        }



        }



        }






