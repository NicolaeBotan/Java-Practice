package Practice;

import java.util.Scanner;

public class NotStringPractice {
    public static void main(String[] args) {
        /*
        Given a string, return a new string where "not " has been added to the front.
        However, if the string already begins with "not", return the string unchanged.
        Note: use .equals() to compare 2 strings.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any word");
        String str = scanner.nextLine();

        if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
            System.out.println(str);
        } else {
            System.out.println("not " + str);
        }
    }
}
