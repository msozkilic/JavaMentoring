package PROJE1;
import java.util.Scanner;
public class GetTotal {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Para miktari :");
        String num1=scanner.nextLine();
        System.out.println("Para miktari :");
        String num2=scanner.nextLine();
        System.out.println("Para miktari :");
        String num3=scanner.nextLine();

        String toplam1=num1.replaceAll("[^0-9]","");
        String toplam2=num1.replaceAll("[^0-9]","");
        String toplam3=num1.replaceAll("[^0-9]","");

        int cevirToplam1=Integer.parseInt(toplam1);
        int cevirToplam2=Integer.parseInt(toplam1);
        int cevirToplam3=Integer.parseInt(toplam1);

        int toplamHepsi=cevirToplam1+cevirToplam2+cevirToplam3;

        if(toplamHepsi>0)
            System.out.println("Toplam :"+toplamHepsi);
       else if(toplamHepsi<0)
            System.out.println("-1");

    }
}
