package Gun13;

import java.util.Scanner;

public class IfInifIf2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayi gir : ");
        String dersNotu = scanner.nextLine();

        int notDonus=Integer.parseInt(dersNotu.replaceAll("[^0-9]",""));

        if (notDonus >= 90) {
            System.out.println("notunuz A");
        } else if (notDonus >= 80) {
            System.out.println("notunuz B");
        } else if (notDonus >= 70) {
            System.out.println("notunuz C");
        } else if (notDonus >= 60) {
            System.out.println("notunuz D ");
        } else if (notDonus >= 40) {
            System.out.println("notunuz E");
        } else if (notDonus > 40) {
                        System.out.println("notunuz F");


                    }
                }
            }

