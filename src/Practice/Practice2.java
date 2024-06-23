package Practice;

public class Practice2 {
    public static void main(String[] args) {
        //write a program that will accept 5 digit number and will print reversed
        // number at the end
        int number = 53876;
        int digit1 = number % 10;//6
        number  /= 10;//5387
        int digit2 = number % 10;//7
        number  /= 10;//538
        int digit3 = number % 10;//8
        number  /= 10;//53
        int digit4 = number % 10;//3
        number  /= 10;//5
        int digit5 = number % 10;//5

        int reverseNumber = digit1 * 10000 + digit2 * 1000 + digit3 * 100 + digit4 * 10 + digit5;
        System.out.println(" Reversed number is " + reverseNumber);






    }
}
