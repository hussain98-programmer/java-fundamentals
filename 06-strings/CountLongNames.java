import java.util.Scanner;

public class CountLongNames {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of friends you have: ");
        int number = input.nextInt();

        String[] friends = new String[number];
        int count = 0;

        System.out.print("Enter your friends' names: ");
        for (int i = 0; i < friends.length; i++) {
            friends[i] = input.next();

            if (friends[i].length() > 4) {
                count++;
            }
        }

        System.out.println("The number of friends' names longer than four letters is: " + count);

        input.close();
    }
}
