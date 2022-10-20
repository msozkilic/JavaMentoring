package Gun18;

public class JavaArray2 {
    public static void main(String[] args) {
        int[] dizi1=new int[5];
        int[] dizi2={5,77,3,786,9,56,6,7,0,-34,};
        String[]dizi3=new String[5];
        boolean[]dizi4=new boolean[4];
        double []dizi5=new double[5];

        for (int i = 0; i <dizi1.length ; i++) {
            System.out.println("dizi1= "+dizi1[i]); }
        for (int i = 0; i < dizi2.length; i++) {
            System.out.println(dizi2[i]);
        }
        for (int i = 0; i < dizi3.length; i++) {
            System.out.println(dizi3[i]); }
        for (int i = 0; i < dizi4.length; i++) {
            System.out.println(dizi4[i]);
        }
        for (int i = 0; i < dizi5.length; i++) {
            System.out.println(dizi5[i]);

        }

    }
}
