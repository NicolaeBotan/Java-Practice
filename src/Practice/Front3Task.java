package Practice;

import java.util.Scanner;

public class Front3Task {
    public static void main(String[] args) {
        /*Given a string, we'll say that the front is the first 3 chars of the string.
        If the string length is less than 3, the front is whatever is there.
        Return a new string which is 3 copies of the front.

        front3("Java") → "JavJavJav"
        front3("Chocolate") → "ChoChoCho"
        front3("abc") → "abcabcabc"
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any String value");
        String str = scanner.nextLine();


        String front = str.length() < 3 ? str : str.substring(0, 3);
        // Extract the front of the string (first 3 characters)
        // Return a new string consisting of 3 copies of the front
        System.out.println(front + front + front);

    }
}
