package wrapperClasses;

public class StringToPrimitive {
    public static void main(String[] args) {

        String str1 = "1234";
        String str2 = "5678";
        System.out.println(str1 + str2);//concatenation --> "12345678"

        //converting String to Number
        //parse method //Parsing
        int number = Integer.parseInt(str1);//Parsing--> converting String to the primitive integer
        Integer number1 = Integer.parseInt(str1);//Parsing and AutoBoxing--> from String to int and to Object

        Short number3 = Short.parseShort(str2);
        System.out.println(number1 + number3);//6912, it will add the numbers

        String str3 = "abcd";
        // int i3 = Integer.parseInt(str3);
        // System.out.println(i3);//NumberFormatException

        //valueOf() method
        // Converting a number to a String
        int number4 = 12;
        String numberAsString = String.valueOf(number4);
        System.out.println(numberAsString + 10);//it will attach as text 1210

        boolean bl = true;
        String booleanAsString = String.valueOf(bl);
        System.out.println(booleanAsString.toUpperCase());// TRUE
        //the boolean true, was converted into String(text upper case)

    }
}
