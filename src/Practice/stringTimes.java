package Practice;

import java.util.Scanner;

public class stringTimes {
    public static void main(String[] args) {
        /*
        Given a string and a non-negative int n,
        return a larger string that is n copies of  the original string.
        stringTimes("Hi", 2) → "HiHi"
        stringTimes("Hi", 3) → "HiHiHi"
        stringTimes("Hi", 1) → "Hi"
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any word");
        String str = scanner.nextLine();
        System.out.println("Please enter any positive digit");
        int num = scanner.nextInt();
        String result = "";
        for (int i = 1; i <= num; i++) {
            result = result.concat(str);
        }
        System.out.println(result);

    }
}
