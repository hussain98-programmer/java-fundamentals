import java.util.Scanner;

public class EvenOrOddChecker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number (-1 to exit): ");
        int num = input.nextInt();

        while (num != -1) {

            boolean result = isEven(num);

            if (result) {
                System.out.println("The number is even");
            } else {
                System.out.println("The number is odd");
            }

            System.out.print("Enter a number (-1 to exit): ");
            num = input.nextInt();
        }

        input.close();
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
}
