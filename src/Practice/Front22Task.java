package Practice;

import java.util.Scanner;

public class Front22Task {
    public static void main(String[] args) {
        /*
        Given a string, take the first 2 chars and return the string with the 2 chars added
        at both the front and back, so "kitten" yields"kikittenki".
        If the string length is less than 2, use whatever chars are there.

        front22("kitten") → "kikittenki"
        front22("Ha") → "HaHaHa"
        front22("abc") → "ababcab"
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any word");
        String str = scanner.nextLine();
        char first = str.charAt(0);
        char second = str.charAt(1);
        System.out.println(first + (second + str + first) + second);

    }
}
