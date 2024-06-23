package Practice;

import java.util.Scanner;

public class NearHundred {
    public static void main(String[] args) {
        /*
        Given an int n, return true if it is within 10 of 100 or 200.
        Note: Math.abs(num) computes the absolute value of a number.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer number");
        int n = scanner.nextInt();

        if (n >= 90 && n <= 100) {
            System.out.println(true);

        } else if (n >= 190 && n <= 200) {

            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}
