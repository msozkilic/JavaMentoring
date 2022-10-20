package Gun17;

public class JavaNestedLoop6 {
    public static void main(String[] args) {
        for (int i = 1; i <=5 ; i++) {
            for (int j = 5; j >=i ; j--) {
                System.out.print("*");

            }
            System.out.println();

        }
        for (int i = 5; i >0; i--) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");

            }
            System.out.println();
            
        }

        for (int satir = 1; satir <=5 ; satir++) {
            for (int bosluk = 5-satir; bosluk >0 ; bosluk--) {
                System.out.print(" ");

            } for (int sutun = 1; sutun <=satir ; sutun++) {
                System.out.print("*");

            }System.out.println();

        }

        }
    }

