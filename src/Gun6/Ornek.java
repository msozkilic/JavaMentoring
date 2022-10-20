package Gun6;
import java.util.Scanner;

public class Ornek {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Bir sayi");
        int sayi=scanner.nextInt();
        System.out.println("Bir sayi daha");
        int sayi2=scanner.nextInt();
        System.out.println("Toplam :"+ (sayi2+sayi));
        System.out.println(sayi+sayi2);

        Scanner scan=new Scanner(System.in);
        System.out.println("Adiniz");
        String ad=scan.nextLine();
        System.out.println("adiniz :"+ ad);

        Scanner sc=new Scanner(System.in);
        System.out.println("KAc bilet?");
        int biletSayi=sc.nextInt();
        System.out.println("Sigorta ister misiniz");
        boolean evet=sc.nextBoolean();
        System.out.println("bilet sayisi :"+biletSayi +"sigorta istegi :"+ evet);








    }
}
