package Gun7;

public class Ornek2 {
    public static void main(String[] args) {
        String str="Ankara";
        String str2="HELLO";
        System.out.println(str.contains("lo"));

        boolean esitMi=str.equals(str2);
        System.out.println(esitMi);
        System.out.println(str.equalsIgnoreCase(str2));

        System.out.println(str.indexOf("k"));
        System.out.println(str.lastIndexOf("z"));

        System.out.println(str.isEmpty());
    }
}
