package arrays;

import java.util.Scanner;

public class ObjectArrayPractice {
    public static void main(String[] args) {
        // the goal is to store different data types in one storage/array
        //we use Object[], object array

        String str = "Test";
        int number = 9;
        boolean bl1 = true;
        double d1 = 9.8;
        Scanner scanner = new Scanner(System.in);

        //all of these can be stored in one storage/

        Object[] example = {str, number, bl1, d1, scanner};//the data type is Object now
        // now I want to reach every element by using the for-each loop

        for ( Object item : example){
            System.out.println(item);//you can not do anything with this just print, because there are different
                                     // data types

            //to can convert everything into a String when you print only
            System.out.println(item.toString().charAt(0));//it will show very first char from each element

            //but it's not common to be used in this form
        }

    }
}
