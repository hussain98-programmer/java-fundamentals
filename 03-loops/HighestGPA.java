import java.util.Scanner;

public class HighestGPA {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double highest = 0.0;

        System.out.print("Enter the number of students: ");
        int n = input.nextInt();

        System.out.print("Enter their GPAs: ");
        for (int i = 1; i <= n; i++) {
            double gpa = input.nextDouble();

            if (gpa > highest) {
                highest = gpa;
            }
        }

        System.out.println("The highest GPA is: " + highest);

        input.close();
    }
}
