package scannerPractice;

import java.util.Scanner;

public class MoneyTransaction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*David wants to deposit his money to his bank account
        -he already got $200 in his account
        - he got 3 different paychecks $400,$600,$350
        - he can only deposit one paycheck at a time
        - after he got his money in the account
        - he bought a phone for $599 and headphone for $299
        - calculate his final money in his account */
        System.out.println("How much money are in your bank account?");
        int bankAccount = scanner.nextInt();
        System.out.println("Initial bank account amount is " +bankAccount);
        System.out.println("How much is your first paycheck ? ");
        int firstPay = scanner.nextInt();
        System.out.println("How much is your second paycheck ? ");
        int secondPay = scanner.nextInt();
        System.out.println("How much is your third paycheck ? ");
        int thirdPay = scanner.nextInt();
        int money2 = firstPay + secondPay + thirdPay;
        System.out.println("Total money after 3 paychecks " + money2 );
        System.out.println("How much is the phone ? ");
        int phone = scanner.nextInt();
        System.out.println("How much are the headphones ? ");
        int headphone = scanner.nextInt();
        int moneyAfterEx = money2 - ( phone + headphone );
        System.out.println("Davids final account balance is " + moneyAfterEx);


    }
}
