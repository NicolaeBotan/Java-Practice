package Loops;

import java.util.Scanner;

public class DoWhilePractice2 {
    public static void main(String[] args) {
        /*
        use do while to solve the task
        get two positive integer numbers from user and find the sum of the range
        2,7---> 3+4+5+6=18
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 2 positive integer numbers");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        number1 = number1 + 1;//add 1 because we don't need to include the first input number1
        int sum = 0;

        do {
            sum = sum + number1;
            number1++;

        } while (number1 < number2);
        System.out.println(sum);

    }
}
