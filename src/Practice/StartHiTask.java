package Practice;

import java.util.Scanner;

public class StartHiTask {
    public static void main(String[] args) {
        /*
        Given a string, return true if the string starts with "hi" and false otherwise.

        startHi("hi there") → true
        startHi("hi") → true
        startHi("hello hi") → false
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any String value");
        String str = scanner.nextLine();
        str = str.toLowerCase();

        if (str.startsWith("hi")) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}
