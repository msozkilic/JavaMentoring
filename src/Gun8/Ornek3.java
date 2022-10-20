package Gun8;

public class Ornek3 {
    public static void main(String[] args) {
        String text="   Merhaba Dunya  ";

        Boolean basliyorMu=text.startsWith("Me");
        System.out.println(basliyorMu);
        boolean bitiyorMu=text.endsWith("Me");
        System.out.println(bitiyorMu);
        String kucuk=text.toLowerCase();
        String buyuk=text.toUpperCase();
        System.out.println(kucuk+"\n "+buyuk);

        String boslukGider=text.trim();
        System.out.println(boslukGider);
    }
}
