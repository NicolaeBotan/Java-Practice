package Practice;

import java.util.Scanner;

public class OneTeen {
    public static void main(String[] args) {
        /*
        We'll say that a number is "teen" if it is in the range 13..19 inclusive.
        Given 2 int values, return true if one or the other is teen, but not both.
        loneTeen(13, 99) → true
        loneTeen(21, 19) → true
        loneTeen(13, 13) → false
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 2  numbers");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        if (num1 >= 13 && num1 <= 19 && num2 >= 13 && num2 <= 19) {
            System.out.println(false);
        } else {
            System.out.println(num1 >= 13 && num1 <= 19 || num2 >= 13 && num2 <= 19);
        }
    }
}
