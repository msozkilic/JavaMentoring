package Gun8;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Ornek4 {
    public static void main(String[] args) {
        String text="Merhaba Dunya";

        String degis=text.replace("a","o");
        String degishep=text.replaceAll("Merhaba","Elveda");
        String ilkDegis=text.replaceFirst("M","D");

        System.out.println(degis+"\n"+degishep+"\n"+ilkDegis);


    }
}
