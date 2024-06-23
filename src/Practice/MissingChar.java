package Practice;

import java.util.Scanner;

public class MissingChar {
    public static void main(String[] args) {
        /*
        Given a non-empty string and an int n, return a new string where the char at index n has been removed.
        The value of n will be a valid index of a char in the original string
        (i.e. n will be in the range 0..str.length()-1 inclusive).

         missingChar("kitten", 1) → "ktten"
         missingChar("kitten", 0) → "itten"
         missingChar("kitten", 4) → "kittn"
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any string value");
        String str = scanner.nextLine();
        System.out.println("Please enter an integer number");
        int index = scanner.nextInt();

        if (index >= 0 && index < str.length()) {
            System.out.println(str.substring(0, index) + str.substring(index + 1));

        } else if (index > str.length()) {
            System.out.println("The number is to big");
        } else {
            System.out.println(str);
        }
    }
}
