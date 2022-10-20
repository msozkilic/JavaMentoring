package Gun9;

public class Ornek4 {
    public static void main(String[] args) {
        int a=5;
        int b=2;
        int k=0;

        a++;  // todo a nin degerini bir artir => a=a+1; 6
        ++a;  // todo a nin degerini bir artir => a=a+1; 7

        k=a++; k=a; a=a+1;
        k=++a; k=a+1; a=a+1;


    }
}
