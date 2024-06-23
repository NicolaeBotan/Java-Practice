package Loops;

import java.util.Scanner;

public class WhilePractice4 {
    public static void main(String[] args) {
        /*
        you/user have $100
        you spend some money
        ask user how much is the spending amount
        if the spending amount is less than balance keep asking user and let him spend more
        if the spending amount is greater than the balance -->"you do nat have enough money to spend!"
         */
        int moneyIHave = 100;
        Scanner scanner = new Scanner(System.in);
        System.out.println("You have $100 to spend.");
        System.out.println("How much is the spending amount?");
        int amount = scanner.nextInt();
        while (moneyIHave > 0) {
            moneyIHave = moneyIHave - amount;

            if (moneyIHave > 0) {
                System.out.println("Your balance is " + moneyIHave + " You can spend more!");
                amount = scanner.nextInt();

            } else {
                System.out.println("You don't have enough money!");
            }


        }
    }


}