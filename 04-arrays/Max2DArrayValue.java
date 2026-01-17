public class Max2DArrayValue {

    public static void main(String[] args) {

        int[][] array2D = {
                {2, 3, 4},
                {10, 12, 14},
                {10, 12, 70},
                {5, 4, 7}
        };

        int max = array2D[0][0];

        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                if (array2D[i][j] > max) {
                    max = array2D[i][j];
                }
            }
        }

        System.out.println("The maximum value is: " + max);
    }
}
