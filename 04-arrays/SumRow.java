public class SumRow {

    public static void main(String[] args) {

        int[][] table = {
                {4, 6, 3, 6},
                {7, 3, 8, 9},
                {6, 10, 12, 13}
        };

        int sum = 0;

        // Sum of the second row (index 1)
        for (int j = 0; j < table[1].length; j++) {
            sum += table[1][j];
        }

        System.out.println("The sum of the 2nd row is: " + sum);
    }
}
