package Gun22;

import java.util.Scanner;

public class JavaMethod6 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);

        System.out.println("1.Sayi =");
        int sayi1=oku.nextInt();

        System.out.println("2.Sayi =");
        int sayi2=oku.nextInt();

       int sonuc=toplamYaz(sayi1,sayi2);
        System.out.println("sonuc"+sonuc);
       int enB=enBuyuk(sayi1,sayi2);
        System.out.println("en buyuk= "+ enB);

    }public static int toplamYaz(int s1,int s2){
        int toplam=s1+s2;
       return toplam;
    }
    public static int enBuyuk(int s1,int s2){
        if(s1>s2)
            return s1;
        else
            return s2;
        //return Math.max(s1,s2);
    }

}
