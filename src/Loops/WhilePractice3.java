package Loops;

import java.util.Scanner;

public class WhilePractice3 {
    public static void main(String[] args) {
        /*
        get a number from user and find the positive divisors of the given number
        10--> 1,2,5,10
        15--> 1,3,5,15
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer number");
        int inputNumber = scanner.nextInt();
        int divisor = 1;
        while (divisor <= inputNumber) {

            if (inputNumber % divisor == 0) {
                System.out.println(divisor);
            }
            divisor++;

        }

    }
}
