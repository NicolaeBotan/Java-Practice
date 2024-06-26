package practiceSara;

public class Practice1 {
    public static void main(String[] args) {

        System.out.println(verifyPalindrome("mama"));

    }

    public static boolean verifyPalindrome(String word) {
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }
        if (reversed.equals(word)) {
            return true;
        } else {
            return false;
        }
    }
}
