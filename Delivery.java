import java.util.Scanner;

public class Delivery {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the distance: ");
        double distance = input.nextDouble();

        double deliveryCharges;

        if (distance <= 3) {
            System.out.println("The delivery will be free.");
        }
        else if (distance > 3 && distance <= 12) {
            deliveryCharges = distance * 1.25;
            System.out.printf("The delivery fees are: %.2f $", deliveryCharges);
        }
        else {
            System.out.println("Sorry! The company's maximum delivery distance is 12 miles.");
        }

        input.close();
    }
}
