package ifStatement;

import java.util.Scanner;

public class ElseIfTask1 {
    public static void main(String[] args) {
        /*
        -get an int number from user
        - check and print out if the given number is positive number, negative number or zero
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer number");
        int number = scanner.nextInt();
        if( number > 0){
            System.out.println("Your number is positive");
        }else if( number < 0){
            System.out.println("Your number is negative");
        }else{
            System.out.println("Your number must be 0");

        }




    }
}
