package Practice;

import java.util.Scanner;

public class FrontBackTask {
    public static void main(String[] args) {
        /*
        Given a string, return a new string where the first and last chars have been exchanged.
        frontBack("code") → "eodc"
        frontBack("a") → "a"
        frontBack("ab") → "ba"
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any word");
        String str = scanner.nextLine();

        if (str.length() <= 1) {

            System.out.println(str);

        } else {

            char first = str.charAt(0);
            char last = str.charAt(str.length() - 1);
            System.out.println(last + str.substring(1, str.length() - 1) + first);

        }
    }
}
