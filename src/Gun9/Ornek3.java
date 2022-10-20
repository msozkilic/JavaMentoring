package Gun9;

public class Ornek3 {
    public static void main(String[] args) {
        String merhaba = "Nereye insanoglu nereye dogru";
        String ayir[] = merhaba.split(" ", 2);
        for (String bol : ayir) {

            System.out.println(bol);
        }

    }
}
