package PROJE2.src;

public class sumTotal {
    /*
        String 2D array oluştur

       {{"$12" , "$22" , "5$"},{"€9" , "€40" , "$1" , "$2"}, {"€12"}}

       String de $ varsa 3.2 ile çarp

       String de € varsa 4.2 ile çarp

       double return et

    */
    public static void main(String[] args) {

//        Koda burdan başlayın
        String[][] dizi = {{"$12", "$22", "5$"}, {"€9", "€40", "$1", "$2"}, {"€12"}};
        double sayi1 = 0;
        for (int satir = 0; satir < 3; satir++) {
            for (int sutun = 0; sutun < 4; sutun++) {
                if (dizi[satir][sutun].contains("$")) ;
                sayi1 = Double.parseDouble(dizi[satir][sutun].replaceAll("[^0-9]", ""));
                System.out.println("$ olunca :" + sayi1 * (3.2));


            }
            double sayi2 = 0;
            {
                for (int sutun = 0; sutun < 4; sutun++) {
                    if (dizi[1][sutun].contains("$")) ;
                    sayi2 = Double.parseDouble(dizi[satir][sutun].replaceAll("[^0-9]", ""));
                    System.out.println("$ olunca :" + sayi2 * (3.2));
                    if(dizi[1][sutun].contains("€")) ;
                    sayi2 = Double.parseDouble(dizi[satir][sutun].replaceAll("[^0-9]", ""));
                    System.out.println("€ olunca :" + sayi2 * (4.2));


                }
                double sayi3 = 0;
                {
                    for (int sutun = 0; sutun < 2; sutun++) {
                        if (dizi[2][sutun].contains("€")) ;
                        sayi3 = Double.parseDouble(dizi[satir][sutun].replaceAll("[^0-9]", ""));
                        System.out.println("€ olunca :" + sayi3 * (4.2));


                    }
                    System.out.println();
                }
            }
        }
    }
}



