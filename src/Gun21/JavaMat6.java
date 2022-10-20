package Gun21;

public class JavaMat6 {
    public static void main(String[] args) {

        int[][] dizi2d = {{0, 1, 2}, {3, 4}, {5, 6, 7, 8, 9}, {11, 12, 13, 14, 15}};

        System.out.println(dizi2d[0].length);
        System.out.println(dizi2d[1].length);
        System.out.println(dizi2d[2].length);
        System.out.println(dizi2d[3].length);

        for (int i = 0; i < dizi2d.length; i++) {
            for (int j = 0; j < dizi2d[i].length; j++) {
                System.out.print(dizi2d[i][j]+" ");


            }
            System.out.println();


        }

    }
}
