package SwitchPractice;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        /*
        ask user for their favorite fruit
        -strawberry, mango, apple, grape, banana
        "We have your favorite fruit...."
        "Sorry! we do not have your favorite fruit ..."
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your favorite fruit?");
        String fruit = scanner.nextLine().toUpperCase();

        switch (fruit) {
            case "MANGO":
            case "APPLE":
            case "GRAPE":
            case "BANANA":
            case "STRAWBERRY":
                System.out.println("We have your favorite fruit " + fruit);//it's going to work because
                break;                                                   //sout was at the end of all cases
            default:
                System.out.println("Sorry! we do not have your favorite fruit " + fruit);

        }

    }
}
