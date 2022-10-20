package PROJE2.src;

import org.w3c.dom.css.CSSUnknownRule;

import java.util.Arrays;
import java.util.Scanner;

public class minNumber {
    /*

         {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}}

         int 2D arrayini  olustur

        2D arrayinden min number print et

     */
    public static void main(String[] args) {

        int[][]dizi= {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}};
        int min=1;

        for (int satir = 0; satir < 4; satir++) {
            for (int sutun = 0; sutun < 3; sutun++) {
                if(dizi[satir][sutun]<min)
                    min=dizi[satir][sutun];


            }

        }
        System.out.println(min);




}

}
