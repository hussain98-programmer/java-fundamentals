import java.util.Scanner;

public class MaxArrayValue {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[] array = new double[5];

        System.out.println("Enter " + array.length + " values:");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextDouble();
        }

        double max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println("The maximum value is: " + max);

        input.close();
    }
}
