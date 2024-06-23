package Practice;

import java.util.Scanner;

public class DifferencePractice {
    public static void main(String[] args) {
        /*
        Given an int n,  return the absolute difference between n and 21,
        except return double the absolute difference if n is over 21.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer number");
        int number = scanner.nextInt();
        int num2 = 21, difference1 = 0;
        double difference2 = 0;
        if (num2 >= number) {
            System.out.println(num2 + " - " + number + " = " + (num2 - number));
        } else {
            System.out.println(num2 + " - " + number + " = " + (num2 - number));
        }
    }
}
