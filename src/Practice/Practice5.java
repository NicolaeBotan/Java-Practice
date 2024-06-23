package Practice;

import java.util.Scanner;

public class Practice5 {
    public static void main(String[] args) {
        //ask the user to give a number from 1 to 100
        //if number is divisible by 3 --> fizz
        //if number is divisible by 5 -->buzz
        //what happens if number is divisible by 3 and 5

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 100");
        int number = input.nextInt();

        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("FizzBuzz");

        } else if (number % 5 == 0) {
            System.out.println("Buzz");

        } else if (number % 3 == 0) {
            System.out.println("Fizz");

        } else {
            System.out.println(number);
        }


    }
}
