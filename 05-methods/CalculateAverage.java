import java.util.Scanner;

public class CalculateAverage {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[12];

        System.out.print("Enter 12 integers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        double result = calculateOddAverage(numbers);

        if (result == -1) {
            System.out.println("There are no odd numbers in the array.");
        } else {
            System.out.printf("The average of the odd numbers in the array is: %.2f", result);
        }

        input.close();
    }

    public static double calculateOddAverage(int[] array) {

        double sum = 0.0;
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                sum += array[i];
                count++;
            }
        }

        if (count == 0) {
            return -1;
        }

        return sum / count;
    }
}
