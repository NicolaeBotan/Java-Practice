package Practice;

import java.util.Scanner;

public class lastDigit {
    public static void main(String[] args) {
        /*
        Given two non-negative int values, return true if they have the same last digit,
        such as with 27 and 57. Note that the % "mod" operator computes remainders, so 17 % 10 is 7.
        lastDigit(7, 17) → true
        lastDigit(6, 17) → false
        lastDigit(3, 113) → true
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 2 positive numbers");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int lastNum1 = num1 % 10;
        int lastNum2 = num2 % 10;

        System.out.println(lastNum1 == lastNum2);

    }
}
