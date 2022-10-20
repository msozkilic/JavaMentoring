package Gun18;

public class GununSorusu {
    public static void main(String[] args) {
            for (int satir = 1; satir <=6; satir++) {
            for (int bosluk = 0; bosluk <= satir-1; bosluk--) {
                System.out.print(" ");
            }
            for (int sutun =13-(satir*2); sutun >0; sutun--) {
                System.out.print("*"); }
                System.out.println();

        }
    }
}
