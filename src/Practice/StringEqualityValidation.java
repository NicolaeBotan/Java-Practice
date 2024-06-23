package Practice;

import java.util.Scanner;

public class StringEqualityValidation {

    public static boolean stringValidation(String word1, String word2) {

        if (word1.equals(word2)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first word:");
        String word1 = scanner.nextLine();
        System.out.println("Please enter the second word:");
        String word2 = scanner.nextLine();

        boolean answer = stringValidation(word1, word2);
        System.out.println(answer);
    }
}
