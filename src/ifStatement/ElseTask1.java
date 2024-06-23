package ifStatement;

import java.util.Scanner;

public class ElseTask1 {
    public static void main(String[] args) {
        /* TASK
    -get the amount of purchase from user as dollar amount
    -when the amount is $1000 or more give user 20% discount and show the final payment
    after the discount
    - if the purchase amount is less then a $1000 give user 5% discount and show
    final payment after discount
    --on top of these charge some tax
    charge 4.5% tax and add to the final payment
    */

        Scanner scanner = new Scanner(System.in);
        System.out.println("In which state do you live? ");
        String state = scanner.nextLine();
        System.out.println("In " + state +" is 4.5% tax");
        System.out.println("What is your total purchase amount? ");
        double amount = scanner.nextDouble();
        double tax = amount / 100 * 4.5;

        if( amount >= 1000){
             double discountOne = amount / 100 * 20;

             System.out.println("Your savings is " +discountOne);
             System.out.println("Your final price after 20% discount is " +((amount - discountOne) +tax) );
         }else{
             double discountTwo = amount / 100 * 5;

             System.out.println("Your discount is " +discountTwo);
             System.out.println("Your final price is after 5% discount is "  +((amount - discountTwo)+tax ) );


         }






    }
}
