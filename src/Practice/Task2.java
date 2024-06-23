package Practice;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        /*
        please remove all the spaces from given string
        if the string length is odd print --> true
        if the string length is even print -->false
        Example: I love coding --> Ilovecoding //11 length means odd --> true
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a String value/phrase");
        String answer = scanner.nextLine();

        String answer1 = answer.replace(" ", "");

        if (answer1.length() % 2 == 0) { //the string length we compare with the remainder, if /2 remains 0

            System.out.println(false);
        } else {
            System.out.println(true);
        }

        //same implementation without "if" condition

        boolean isOdd = answer1.length() % 2 == 1; //all this solved the task
        System.out.println(isOdd);





    }
}
