package codeBat;

import java.util.Scanner;

public class StringSplosion {
    public static void main(String[] args) {
        /*
        Given a non-empty string like "Code" return a string like "CCoCodCode".
        stringSplosion("Code") → "CCoCodCode"
        stringSplosion("abc") → "aababc"
        stringSplosion("ab") → "aab"
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any word");
        String str = scanner.nextLine();
        String result = "";

        for(int i = 0; i < str.length(); i++){
            result = result + str.substring(0,i+1);
        }
        System.out.println(result);
    }
}
