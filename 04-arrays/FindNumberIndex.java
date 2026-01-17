import java.util.Scanner;

public class FindNumberIndex {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] array = new int[8];

        System.out.print("Enter 8 numbers: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }

        System.out.print("Enter a number to search for: ");
        int num = input.nextInt();

        int index = findIndex(array, num);

        if (index == -1) {
            System.out.println("The number was not found in the array.");
        } else {
            System.out.println("The number is found at index: " + index);
        }

        input.close();
    }

    public static int findIndex(int[] array, int num) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                return i;
            }
        }
        return -1;
    }
}
