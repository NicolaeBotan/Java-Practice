package Practice;

import java.util.Scanner;

public class In1020Task {
    public static void main(String[] args) {
        /*
        Given 2 int values, return true if either of them is in the range 10..20 inclusive.

        in1020(12, 99) → true
        in1020(21, 12) → true
        in1020(8, 99) → false
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any integer number");
        int num1 = scanner.nextInt();
        System.out.println("Please enter any integer number");
        int num2 = scanner.nextInt();

        if (num1 >= 10 && num1 <= 20 || num2 >= 10 && num2 <= 20) {

            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}
