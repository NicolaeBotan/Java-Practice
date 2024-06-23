package stringBasics;

public class StringMethods1 {
    public static void main(String[] args) {
        String str = "Sunday";

        //length(); count number of characters in given string and return in "int" giving a number
        int number = str.length();//is going to get the count of characters of "Sunday" which is 6
        System.out.println(number);//result is 6

        str += " is a rainy day ";//concatenation (concat)
        int number1 = str.length();
        System.out.println(number1);
        // concat (attach the string in to another string)
        str = str.concat("and java is getting easy");//we combined together all 3 vales of the str
        System.out.println(str);                        //Sunday+is a rainy day+and java is getting easy

        //charAt(); will return a single char from given position on a string
        str = "re d$";//space is considered as a "char"
        char symbol = str.charAt(4);//on position 4 is a char
        System.out.println(symbol);// result is "$"
        char firstSymbol = str.charAt(0);
        System.out.println(firstSymbol);//result is "r"

        //want to take last char from given string, but you do nat know the index number of the last char
        int count  = str.length();//length gives back a number so should be stored as a int
        char last = str.charAt(count - 1);
        System.out.println(last);

        System.out.println( str.charAt(str.length() -1));//same thing only substitute








    }
}
