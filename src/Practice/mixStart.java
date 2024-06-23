package Practice;

import java.util.Scanner;

public class mixStart {
    public static void main(String[] args) {
        /*
        Return true if the given string begins with "mix", except the 'm' can be anything,
        so "pix", "9ix" ... all count.
        mixStart("mix snacks") → true
        mixStart("pix snacks") → true
        mixStart("piz snacks") → false
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any word...");
        String str = scanner.nextLine();

        if (str.length() >= 3 && str.substring(1, 3).equalsIgnoreCase("ix")) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
