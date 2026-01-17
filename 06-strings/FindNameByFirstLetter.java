import java.util.Scanner;

public class FindNameByFirstLetter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.next();
        char firstLetter = name.charAt(0);

        String[] friendsNames = new String[5];

        System.out.print("Enter 5 friends names: ");
        int count = 0;

        for (int i = 0; i < friendsNames.length; i++) {
            friendsNames[i] = input.next();

            if (friendsNames[i].charAt(0) == firstLetter) {
                count++;
            }
        }

        System.out.println("There are " + count + " friends with the same first letter.");

        input.close();
    }
}
