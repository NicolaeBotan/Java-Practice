package Practice;

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        /*
        Given 2 int values, return true if one is negative and one is positive.
        Except if the parameter "negative" is true, then return true only if both are negative.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 1st integer number");
        int num1 = scanner.nextInt();
        System.out.println("Please enter 2nd integer number");
        int num2 = scanner.nextInt();

        if (num1 < 0 || num2 < 0) {
            System.out.println(true);
        } else if (num1 < 0 && num2 < 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}
