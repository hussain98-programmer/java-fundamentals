public class Array2D {
    public static void main(String[] args) {

        int[][] array = new int[5][5];

        array[1][0] = 1; array[1][1] = 1;
        array[2][0] = 2; array[2][1] = 2; array[2][2] = 2;
        array[3][0] = 3; array[3][1] = 3; array[3][2] = 3; array[3][3] = 3;
        array[4][0] = 4; array[4][1] = 4; array[4][2] = 4; array[4][3] = 4; array[4][4] = 4;

        System.out.println("Array elements are:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
