import java.util.Scanner;

public class TicketPrice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the age: ");
        int age = input.nextInt();

        System.out.print("Is it a weekend? (yes / no): ");
        String weekend = input.next();

        int price;

        if (weekend.equals("yes")) {
            if (age < 13) {
                price = 80;
            } else {
                price = 120;
            }
        } else { // not weekend
            if (age < 13) {
                price = 100;
            } else if (age < 65) {
                price = 180;
            } else {
                price = 140;
            }
        }

        System.out.println("The total price is: " + price + "$");

        input.close();
    }
}
