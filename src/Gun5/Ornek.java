package Gun5;

import java.util.SplittableRandom;

public class Ornek {
    public static void main(String[] args) {

        int sayi=68;
        char harf=(char)sayi;
        System.out.println(harf);

        String yazi=Integer.toString(sayi);
        int sayiyaCevir=Integer.parseInt(yazi);

        String e="500";
        String e2="1000";

        int toplam=Integer.parseInt(e+e2);
        System.out.println(toplam);

        String kenar="5";
        int cevre=Integer.parseInt(kenar)*4;
        System.out.println(cevre);

        String dogru="true";
        boolean dogruMu=Boolean.parseBoolean(dogru);
        System.out.println(dogruMu);

        String gece="15";
        String gund="16";
        int hava=Integer.parseInt(gece);
        int hava2=Integer.parseInt(gece);
        int topl=hava+hava2;
        System.out.println(topl);

    }
}
