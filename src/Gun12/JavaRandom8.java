package Gun12;

import java.util.Scanner;

public class JavaRandom8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("min max deger gir :");
        String min_max=scanner.nextLine();

        int bosluk=min_max.indexOf(" ");
        int min=Integer.parseInt(min_max.substring(0,bosluk));
        int max=Integer.parseInt(min_max.substring(bosluk+1));

        int randomS=(int)(Math.random()*((max-min)+1))+min;

        System.out.println(randomS);

    }
}
