package Practice;

import java.util.Scanner;

public class endUp {
    public static void main(String[] args) {
        /*
        Given a string, return a new string where the last 3 chars are now in upper case.
        If the string has less than 3 chars, uppercase whatever is there.
        Note that str.toUpperCase() returns the uppercase version of a string.
        endUp("Hello") → "HeLLO"
        endUp("hi there") → "hi thERE"
        endUp("hi") → "HI"
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any word");
        String str = scanner.nextLine();

        if (str.length() < 3) {
            System.out.println(str.toUpperCase());
        } else {

            String lastThree = str.substring(str.length() - 3).toUpperCase();
            System.out.println(str.substring(0, str.length() - 3) + lastThree);
        }
    }
}
