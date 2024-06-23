package Practice;

import java.util.Scanner;

public class IcyHotTask {
    public static void main(String[] args) {
        /*
        Given two temperatures, return true if one is less than 0 and the other is greater than 100.

        icyHot(120, -1) → true
        icyHot(-1, 120) → true
        icyHot(2, 120) → false
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter temperature number 1 ");
        int temp1 = scanner.nextInt();
        System.out.println("Please enter temperature number 2");
        int temp2 = scanner.nextInt();

        if (temp1 < 0 || temp1 > 100 && temp2 < 0 || temp2 > 100) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}
