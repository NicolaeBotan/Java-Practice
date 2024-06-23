package Practice;

import java.util.Scanner;

public class everyNTH {
    public static void main(String[] args) {
        /*
        Given a non-empty string and an int N, return the string made starting with char 0,
        and then every Nth char of the string.
        So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.
        everyNth("Miracle", 2) → "Mrce"
        everyNth("abcdefg", 2) → "aceg"
        everyNth("abcdefg", 3) → "adg
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any word");
        String str = scanner.nextLine();
        System.out.println("Please enter any digit");
        int num = scanner.nextInt();

        //to store the result String
        StringBuilder result = new StringBuilder();

        // Iterate through the string starting from index 0, and increment by num each time
        for (int i = 0; i < str.length(); i += num) {
            result.append(str.charAt(i)); // Append the character at index i to the result
        }
        System.out.println(result); // Convert StringBuilder to string and return;
    }
}



