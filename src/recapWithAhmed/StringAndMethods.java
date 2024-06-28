package recapWithAhmed;

import java.util.Arrays;

public class StringAndMethods {
    /*
    POSSIBLE INTERVIEW QUESTIONS:
             1--> Most of the technical are related with String and Methods.

             2--> What is the difference between (.equals) and (==)
             - String (.equals) --> Making a comparison of "TWO VALUES"
             Answer: First of all , that is a great question. I do not use a lot (==) for a String value
             comparison other than other primitive types(int,long).
             When I use String.equals() it compares only the VALUE of the data.
             When I use == which compares not only the Value but also Location of the Object.
             Ex:
             String name = "Ahmet";//this is coming from String Pool
             String name1 = new String("Ahmet");//this is coming from Heap Memory
             sout(name.equals(name1));
             sout(name == name1);

             3--> What is String and how do you declare? declare/create
             -  String is an Object that is used to store some data.
             -  String has some specific methods that we use for any purposes like comparison.
             -  I can declare the String in 2 ways:
             --->String str; "DECLARE" -means create a bucket(storage) without assigning the value.
             --->String str2 = "Ahmet"; "INITIALIZE"- means you create a bucket with assigning the value.
             - - String str3 = new String(); DECLARATION
             - - String str4 = new String("Ahmet"); INITIALIZATION

    STRING METHODS: * MEANS IT IS REALLY IMPORTANT NOT ONLY FOR TECHNICAL BUT ALSO AUTOMATION
             1- IndexOf() --> it gives you the index number of character, returns int/number
             2- Length() --> it gives you the length of the data/value, returns int/number
             3- Concat() --> it is a way to combine 2 or more values, concat() or "+". Returns String.
             4- Split() --> it is a way to cut the words from a specific spot. It returns String[] Array
             5- StartsWith() --> it checks the value if it starts with a specific character/word. Returns Boolean.
             6- EndsWith() --> it checks the value if it ends with a specific character/word. Returns Boolean.
           * 7- Substring() --> it is a way to get specific characters or words from String.Returns String.
           * 8- CharAt() --> it gives you the Character at the specific index spot. Returns Char.
         *** 9- Contains() --> it checks the value if it has the data you are looking for. Returns Boolean.
         ***10- Trim() --> it removes the spaces from begging and the end.
           *11- Replace() --> it replaces the specific character/words in String. Returns String.
         ***12- Equals() --> compares two values of variable and returns Boolean.
           *13- EqualIgnoreCase()--> it compares 2 values of variables ignoring Case. Returns Boolean.
          **14- ValueOf() --> converts the different data type to String Type. Returns String.
           *15- ToUpperCase/ToLowerCase --> it changes the characters to upper or lower case.It returns String.


             Tips: Ones you are explaining in IT-->
             - Use IT Terminology --> declare,initialize,etc...
             - Explain from General to Deep.

     */
    public static void main(String[] args) {
//        //String (.equals) --> Making a comparison of "TWO VALUES"
//
//        String name = "Ahmet";//this is coming from String Pool
//        String name1 = new String("Ahmet");//this is coming from Heap Memory
//        System.out.println((name.equals(name1)));//true--> because .equals() compares the values, doesn't care
//        //where the values are coming from
//        System.out.println((name == name1));//false--> compares not only value but also location in the memory
//        System.out.println(name.hashCode());//63235125 --> coming from String Pool that is inside the Heap Memory
//        System.out.println(name1.hashCode());//63235125 --> using the same spot in Heap Memory
//
//
        String str = "Ahmet Loves Java";
        String str1 = new String("Ahmet Loves Java");
        String str2 = "Ahmet Loves Java";
        String str3 = new String("Ahmet Loves Java");
        System.out.println(str.equals(str1));//true//comparing only value
        System.out.println(str1 == str3);//false because they are different Objects//not only value
        System.out.println(str == str2);//true because they are from the String Pool and are the same.

        System.out.println(str.indexOf('t'));//indexOf --> 4 return
        System.out.println(str.length());//16 , length starts from 1
        System.out.println(str.concat(" " + str2));//Ahmet Loves Java Ahmet Loves Java
        //we put " " before str2 to separate with space both Strings when we concat them

        String[] words = str.split(" ");//tells where to split, now we got the space
        //it returns as String Array
        // to access each word in the Array we use loop or indexOf []
        System.out.println(words[0]);//first word "Ahmet"
        System.out.println(words[1]);//second word "loves"
        System.out.println(words[2]);// third word "Java"
        System.out.println(Arrays.toString(words));// to print all words "[Ahmet, Loves, Java]"

        //String str2 = "Ahmet Loves Java";
        str2.replace("Ahmet", "ahmet");//String is immutable, so you need to reassign to change the
        //value of str2
        //so because we did not reassign , str2 remains the same
        System.out.println(str2.startsWith("Ahmet"));//true
        System.out.println(str2.endsWith("Va"));//false

        //Substring() method
        //Substring() is better than Character because you can manipulate the String better than a char
        char ch = str2.charAt(3);
        String sbsr = str2.substring(3, 4);//REMEMBER,SECOND PARAMETER IS NOT INCLUDED
        System.out.println(ch);//e
        System.out.println(sbsr.toUpperCase());//E
        System.out.println(sbsr.toLowerCase());//e

        //equalIgnoreCase() method
        String exp = "Hello Guys";
        String exp2 = "hello guys";
        System.out.println(exp2.equalsIgnoreCase(exp));// true
        //I would use .equals() 99 percent for validation and 1 percent equalsIgnoreCase

        //valueOf()
        int num = 5;
        int num2 = 3;
        String bucket = String.valueOf(num) + String.valueOf(num2);
        //im attaching int num with num2 which is 53 as String
        System.out.println(bucket);//53

        //contains()
        boolean result = str2.contains("av");//Ahmet loves Java
        System.out.println(result);//true

        //trim()
        String lastExample = " We are completing String".trim();
        String lastExample2 = "We are completing String";
        System.out.println(lastExample.equals(lastExample2));//true because of the space before "We" was trim()


    }
}
