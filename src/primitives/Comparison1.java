package primitives;

public class Comparison1 {
    public static void main(String[] args) {
        //==
        int a = 4, b = 4;
        System.out.println(a == b);//true

        boolean result1 = a == a;
        System.out.println(result1); //true
        System.out.println(result1 == true);//true

        boolean result2 = ++a == 2 + 3;
        System.out.println(result2);//true
        System.out.println(7 == 8);//false

        // != not equal
        int num1 = 6, num2 = 6;
        boolean result3 = num1 != num2;
        System.out.println(result3);//false because they are the same

        System.out.println(num1 != 2);//true

        char letter = '9';
        System.out.println(letter != 9); //true because char '9' is a symbol that
        //the decimal number for 9 in ASCII table is not 9

        char letter2 = 'A';
        System.out.println(letter2 != 65);//false because decimal value of A is 65 in ASCII table
        System.out.println(letter2 == 65);// true
        System.out.println('t' != 'T');// true , lower case and upper case are different

        //>greater than

        System.out.println(0 > 1);//false
        boolean result4 = 0 > 1; //value of result4 is false
        System.out.println(result4);//false
        //System.out.println(result4 > (9 + 10)); not working because im comparing different data
        System.out.println((10 * 2) > (9 + 10));//true

        System.out.println('A' > 'a');// 65 > 97 from ASCII table ,not comparing the symbols but values
        // so it will be false

        //< ---less than
        System.out.println(67 < 90);// true
        double d1 = 1.25, d2 = 12.5;
        boolean result5 = d1 < d2;
        System.out.println(result4 != result5); //true because value of result4 is false
        System.out.println("=============================================");
        //>= greater than or equal to
        System.out.println(7 >= 7); // true because >= means greater or equal so its equal

        int count = 34;
        count += count; //count = count + count (68)
        int count2 = count + count; // 68 + 68 = 136
        boolean result6 = count >= count2; //68 >= 136 false
        System.out.println(" Result6 is " + result6);//false

        //<= less than or equal

        System.out.println(4 <= 8);// because its smaller 4 than 8
        System.out.println(6 <= 6);//because its equal
        System.out.println(9 <= 8);//false
        System.out.println('a' <= 'b'); //true because compares the values from ASCII table
        System.out.println("hi" == "bye"); // false
        System.out.println("hi" == "hi"); //true the text can be compared also only when you use == equal equal
        System.out.println("hi" != "hi"); //false
        // System.out.println("hi" > "hi");(<,>=,<=,) not going to work because we cant compare text

        int x = 'b'; //it assigned the decimal value from ASCII table 98
        int y = x;
        System.out.println(x > y);//false



    }


    }