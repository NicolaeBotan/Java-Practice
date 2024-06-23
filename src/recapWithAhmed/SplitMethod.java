package recapWithAhmed;

import java.util.Arrays;

public class SplitMethod {
    public static void main(String[] args) {
        /*
        String str = "Hello Java is so good";
        out put: olleH avaJ si os doog
               olleH
               avaJ
               si
               os
               doog
         */
        String str = "Hello Java is so good";
        String[] array = str.split(" "); //we will split from the space
        //also split() method returns array, so we store it in array

        System.out.println(Arrays.toString(array));//[Hello, Java, is, so, good]
        //I want to store the reversed words in a String
        String reverse = "";
        for (String word : array) {
            reverse = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                reverse += word.charAt(i);
            }
            System.out.print(reverse + " ");//to print  them on one line and separate with space
        }

    }
}
