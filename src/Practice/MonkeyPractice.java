package Practice;

import java.util.Scanner;

public class MonkeyPractice {
    public static void main(String[] args) {
        /*
        We have 2 monkeys, a and b, and if the parameters aSmile and bSmile indicate eif each is smiling.
        we are in trouble if they both are smiling or if neither of them is smiling.Return true if we are
        in trouble.
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Is the first monkey smiling? true/false");
        boolean answer = scanner.nextBoolean();
        System.out.println("Is the second monkey smiling? true/false");
        boolean answer2 = scanner.nextBoolean();

        if (answer == answer2) {
            System.out.println("We are in trouble");
        } else {
            System.out.println("We are not in trouble");
        }
    }
}
