package Gun21;

public class JavaMat2 {
    public static void main(String[] args) {

        int[][]mat = {{1, 2, 3}, {2, 3, 1}, {5, 5, 5}, {2, 10, 3}};

        int max=mat[0][0];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                if (mat[i][j]>max)
                    max=mat[i][j];
                System.out.print(max+" ");

            }

        }
        System.out.println("max ="+max);



    }
}
