package Ternary;

import java.sql.SQLOutput;

public class Practice2 {
    public static void main(String[] args) {
        String str = "Techtorial";
        String str2 = new String("Techtorial");//it's a new String with the same value in the pool

       String result1 = 'a' == 'a' ? str.concat(" Academy") : str.replace("Tech", "TECH");

        System.out.println(result1);

        System.out.println('a' == 'a' ? str.concat(" Academy") : str.replace("Tech", "TECH"));

        System.out.println('a' > 'a' ? str.concat(" Academy") : str.replace("Tech", "TECH"));






    }
}
