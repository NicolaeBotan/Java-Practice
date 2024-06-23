package Loops;

public class ReversingString {
    public static void main(String[] args) {
        /*
        check if the given String is palindrome or not, meaning if it can be read the same from left to right
        and back.
        Example : EFE, YAY, WOW, civic, level, anna, ...
         */
        String str = "level";// level
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {

            reversed += str.charAt(i);//we keep attaching the chars in to that reversed String
        }
        if (str.equals(reversed)) {
            System.out.println("It is palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }
}
