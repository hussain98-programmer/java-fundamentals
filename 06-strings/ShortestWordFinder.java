import java.util.Scanner;

public class ShortestWordFinder {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] words = new String[5];

        System.out.print("Enter 5 words: ");
        for (int i = 0; i < words.length; i++) {
            words[i] = input.next();
        }

        System.out.println("The shortest word is: " + shortestWord(words));

        input.close();
    }

    public static String shortestWord(String[] words) {

        String shortest = words[0];

        for (int i = 1; i < words.length; i++) {
            if (words[i].length() < shortest.length()) {
                shortest = words[i];
            }
        }
        return shortest;
    }
}
