package Practice;

import java.util.Scanner;

public class intMax {
    public static void main(String[] args) {
        /*
        Given three int values, a b c, return the largest.
        intMax(1, 2, 3) → 3
        intMax(1, 3, 2) → 3
        intMax(3, 2, 1) → 3
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 3 numbers...");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int max = num1;

        if (num2 > max) {
            max = num2;

        } else if (num3 > max) {
            max = num3;
        }
        System.out.println(max);

    }
}
