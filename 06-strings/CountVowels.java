import java.util.Scanner;

public class CountVowels {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = input.nextLine();

        int result = countVowels(word);
        System.out.println("The number of vowels in \"" + word + "\" is " + result);

        input.close();
    }

    public static int countVowels(String word) {

        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            char ch = Character.toLowerCase(word.charAt(i));

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
}
