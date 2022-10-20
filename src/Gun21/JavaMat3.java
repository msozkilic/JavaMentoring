package Gun21;

public class JavaMat3 {
    public static void main(String[] args) {
        int[][] dizi = {{1, 2, 3}, {2, 3, 1}, {5, 5, 5}, {2, 1, 3}};
        int min = dizi[0][0];

        for (int satir = 0; satir < 4; satir++) {
            for (int sutun = 0; sutun < 3; sutun++) {
                if (dizi[satir][sutun] < min)
                    min = dizi[satir][sutun];
            }
        }
        System.out.println(min);
    }
}
