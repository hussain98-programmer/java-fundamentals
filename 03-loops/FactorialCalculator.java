public class FactorialCalculator {

    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {
            System.out.println("The factorial of " + i + " is " + factorial(i));
        }
    }

    public static int factorial(int num) {

        if (num == 0) {
            return 1;
        }

        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }

        return result;
    }
}
