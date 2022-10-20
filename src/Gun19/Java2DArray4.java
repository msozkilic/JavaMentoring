package Gun19;

import java.util.Scanner;

public class Java2DArray4 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int[] dizi1=new int[5];
        int[]dizi2={4,7,18,9,13};

        int[][]mat1=new int[2][3];
        int[][]mat2= {{65,76,90},{80,66,95}};

        int tumToplam=0;
        for (int satir = 0; satir < 2; satir++) {
            for (int sutun = 0; sutun < 3; sutun++) {
                tumToplam+=mat2[satir][sutun];
                System.out.println();


            }System.out.println("tumtoplam :"+tumToplam);
            int ders1Toplam=0;
            for (int sutun = 0; sutun < 3; sutun++) {
                ders1Toplam+=mat2[0][sutun];

            }int ders2Toplam=0;
            for (int sutun = 0; sutun < 3; sutun++) {
                ders2Toplam+=mat2[1][sutun];
            }
            System.out.println("ders1 ortalama :"+ders1Toplam/3);
            System.out.println("ders2 ortalama :"+ders2Toplam/3);

        }

                
            }
        }


