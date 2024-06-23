package Practice;

import java.util.Scanner;

public class BackAroundTask {
    public static void main(String[] args) {
        /*
        Given a string, take the last char and return a new string with the last char added at the
        front and back, so "cat" yields "tcatt". The original string will be length 1 or more.

        backAround("cat") → "tcatt"
        backAround("Hello") → "oHelloo"
        backAround("a") → "aaa"
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any word");
        String str = scanner.nextLine();

        System.out.println(str.charAt(str.length() - 1) + str + str.charAt(str.length() - 1));

    }
}
