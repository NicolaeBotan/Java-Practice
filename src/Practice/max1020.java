package Practice;

import java.util.Scanner;

public class max1020 {
    public static void main(String[] args) {
        /*
        Given 2 positive int values, return the larger value that is in the range 10..20 inclusive,
        or return 0 if neither is in that range.
        max1020(11, 19) → 19
        max1020(19, 11) → 19
        max1020(11, 9) → 11
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 2 positive numbers");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        if (num1 >= 10 && num1 <= 20 && num2 >= 10 && num2 <= 20){
            if(num1 > num2){
                System.out.println(num1);
            }else if(num2 > num1){
                System.out.println(num2);
            }
        }else if(num1 >= 10 && num1 <= 20){
            System.out.println(num1);
        }else if(num2 >= 10 && num2 <= 20){
            System.out.println(num2);
        }else {
            System.out.println(0);
        }
    }
}
