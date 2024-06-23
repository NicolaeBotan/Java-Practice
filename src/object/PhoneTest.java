package object;

import java.util.Scanner;

public class PhoneTest {
    public static void main(String[] args) {

        //We will use the scanner to get the first parameter "shape" from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("What phone shape are you looking for?");
        String answer = scanner.nextLine();

        Phone firstPhone = new Phone(answer, "black", 1139.99, true);

        System.out.println("rectangle".equalsIgnoreCase(firstPhone.shape));// return is true
        //just comparing regular text "rectangle" with the parameter we gave when we created the firstPhone object
        // if the user will put something different then "rectangle" the answer will be false.

        //Let's use the call method

        firstPhone.call(8017500319L);// return is "I am calling >> 8017500319"L-long at the end
        //in the method, in Phone.java class we included the printout so here when we call the method it shows
        //already the printout without using sout here in this class

        //Task
        //create a method to check phone prise
        //if the price is under my budget, I will buy.
        double budget = 2000;
        System.out.println(budget > firstPhone.price);//true

        priceCheck(firstPhone, budget);// to see the method implemented beyond
    }

    public static void priceCheck(Phone phone, double limit) {
        if (phone.price < limit) {
            System.out.println("This is in your budget: " + phone.color);//This is in your budget: black
        }

    }
}
