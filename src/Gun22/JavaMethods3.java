package Gun22;

public class JavaMethods3 {
    public static void main(String[] args) {
    tekMiciftMi(12);
    tekMiciftMi(11);

    topla(5,3);
    }
    public static void topla(int a,int b){
        System.out.println("topla ="+ (a+b));
    }
    public static void tekMiciftMi(int sayi){

        if(sayi%2==1)
            System.out.println("Tek");
        else
            System.out.println("Cift");
    }

}
