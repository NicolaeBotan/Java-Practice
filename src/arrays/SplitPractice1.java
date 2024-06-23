package arrays;

import java.util.Arrays;

public class SplitPractice1 {
    public static void main(String[] args) {

        String str1 = "Selenium";
        String[] parts = str1.split("n");

        System.out.println(Arrays.toString(parts));//return is [Sele, ium]

        //csv files (is comma separated values)
        //today,is,saturday (Examples)
        //today is saturday (Examples)
        System.out.println(parts[1]); // ium
        System.out.println(parts.length); //2
        parts[1] = "abcd"; //we reassigned the value of the index 1
        System.out.println(Arrays.toString(parts));// return is [Sele, abcd]

        //TASK

        String str2 = "It is a good day to practice Java. It is snowing outside.";
        //store every word in an array
        str2 = str2.replace(".", "");
        String[] str3 = str2.split(" ");
        System.out.println(Arrays.toString(str3));
        // Return is [It, is, a, good, day, to, practice, Java, It, is, snowing, outside]
String[] items = {"It", "is", "a", "good", "day", "to", "practice", "Java", "It", "is", "snowing", "outside" };












    }
}
