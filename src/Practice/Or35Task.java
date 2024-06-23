package Practice;

import java.util.Scanner;

public class Or35Task {
    public static void main(String[] args) {
        /*
        Return true if the given non-negative number is a multiple of 3 or a multiple of 5.
        Use the % "mod"

        or35(3) → true
        or35(10) → true
        or35(8) → fals
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any positive number");
        int number = scanner.nextInt();

        if (number % 3 == 0 || number % 5 == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}

