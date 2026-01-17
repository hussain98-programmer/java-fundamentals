public class MaxTwoArrays {

    public static void main(String[] args) {

        int[][] a = {
                {7, 2, 2},
                {4, 2, 9},
                {1, 2, 3}
        };

        int[][] b = {
                {4, 5, 5},
                {2, 3, 4},
                {1, 2, 2}
        };

        int[][] result = max(a, b);

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] max(int[][] a, int[][] b) {

        int[][] c = new int[a.length][a[0].length];

        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                if (a[i][j] >= b[i][j]) {
                    c[i][j] = a[i][j];
                } else {
                    c[i][j] = b[i][j];
                }
            }
        }
        return c;
    }
}
