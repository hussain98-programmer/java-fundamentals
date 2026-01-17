import java.util.Scanner;

public class LongestName {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String longestName = "";

        System.out.println("Enter student names ('finish' to stop): ");
        String name = input.next();

        if (name.equals("finish")) {
            System.out.println("No name was entered.");
        } else {
            while (!name.equals("finish")) {

                if (name.length() > longestName.length()) {
                    longestName = name;
                }

                name = input.next();
            }

            System.out.println("The longest name entered is: " + longestName);
        }

        input.close();
    }
}
