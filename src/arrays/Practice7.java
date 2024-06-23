package arrays;

public class Practice7 {
    public static void main(String[] args) {

        char[] symbols = {'a', '#', '1', 'W', '3', '6', '@'};
        //print only digits
        //print out other symbols(ex: #,$,&,@..)

        //count the digits,letters and other symbols
        //There are 2 letters
        //There are 3 digits
        int sumLetters = 0, sumDigits = 0, sumSymbols = 0;

        for (int i = 0; i < symbols.length; i++) {

            if (symbols[i] >= '0' && symbols[i] <= '9') {
                sumDigits++;
                System.out.println(symbols[i]);

            } else if (symbols[i] >= 'a' && symbols[i] <= 'z' || symbols[i] >= 'A' && symbols[i] <= 'Z') {
                sumLetters++;
                System.out.println("These are letters " + symbols[i]);

            } else {
                sumSymbols++;
                System.out.println("Others " + symbols[i]);

            }

        }
        System.out.println("There are " + sumDigits + " digits");
        System.out.println("There are " + sumLetters + " letters");
        System.out.println("There are " + sumSymbols + " symbols");
    }
}
