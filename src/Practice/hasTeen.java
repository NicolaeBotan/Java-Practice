package Practice;

import java.util.Scanner;

public class hasTeen {
    public static void main(String[] args) {
        /*
        We'll say that a number is "teen" if it is in the range 13..19 inclusive.
        Given 3 int values, return true if 1 or more of them are teen.
        hasTeen(13, 20, 10) → true
        hasTeen(20, 19, 10) → true
        hasTeen(20, 10, 13) → true
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 3 numbers");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        if (num1 >= 13 && num1 <= 19 || num2 >= 13 && num2 <= 19 || num3 >= 13 && num3 <= 19) {
            System.out.println("Has teen " + true);
        } else {
            System.out.println(false);
        }
    }
}
