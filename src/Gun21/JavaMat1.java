package Gun21;

public class JavaMat1 {
    public static void main(String[] args) {
        int sayi=0;
        int[]dizi1=new int[5];
        int[][]mat=new int[4][5];

        mat[0][0]=(int)(Math.random()*100)+1;
        mat[0][1]=(int)(Math.random()*100)+1;
        mat[0][2]=(int)(Math.random()*100)+1;
        mat[0][3]=(int)(Math.random()*100)+1;
        mat[0][4]=(int)(Math.random()*100)+1;

        mat[1][0]=(int)(Math.random()*100)+1;
        mat[1][1]=(int)(Math.random()*100)+1;
        mat[1][2]=(int)(Math.random()*100)+1;
        mat[1][3]=(int)(Math.random()*100)+1;
        mat[1][4]=(int)(Math.random()*100)+1;

        for (int satir = 0; satir < 4; satir++) {
            for (int sutun = 0; sutun < 5; sutun++) {
                mat[satir][sutun]=(int)(Math.random()*100)+1;   //todo 1.for da deger atadik

            }

        }
        for (int satir = 0; satir < 4; satir++) {
            for (int sutun = 0; sutun < 5; sutun++) {
                System.out.print(mat[satir][sutun]+" ");//todo 2.for da degerleri yazdirdik

            }
            System.out.println();

        }


    }
}
