package recapWithAhmed;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayRecap {
    /*
    POSSIBLE INTERVIEW QUESTIONS:
          1- What is the difference between Array and ArrayList?

          --> What is Array?
          --> What is the purpose of usage?
          --> Where do we use it?
          --> How do we use it?
                 ==> Array is a storage for primitives and Objects.
                 ==> The purpose of usage is that we can store the data temporarily and use
                 it for different purposes. It is a simple way of storing the data at the time.

          ArrayList:                                   Array:
          1-Dynamic size.                              1-Fixed Size.
          2-Storage for only Objects.                  2-Can store primitives and Objects
          3-It doesn't have multidimensional           3- It does have multidimensional form.
          form.
          4-It has some good methods(add,get,size)     4- It does not have methods but functions(length)
          5-Can be manipulable(you can change it)      5- It is not manipulable because you have no methods
          6- Syntax is different                       6- Syntax is different

     */

    public static void main(String[] args) {

        int[] numbers = new int[5]; //when you crete an array you should provide the size, because size is fixed
        //two ways to assign the value
        numbers[0] = 1;
        numbers[1] = 2;
        //OR we assign the value when we create the Array
        //storing primitives in Array
        int[] numbers2 = {1, 2};
        System.out.println(Arrays.toString(numbers));//[1, 2, 0, 0, 0]
        System.out.println(Arrays.toString(numbers2));//[1, 2]

        //storing String Object in an Array
        String[] names = {"David", "Alex", "Jim"};

        //How we PROVE that ArrayList can store only Object data type
        ArrayList mix = new ArrayList();
        mix.add(numbers2[0]);
        //numbers2[0]. has no methods so it ,means it is primitive
        //mix.get(0). it will give me all the Object methods

        //numbers2[1].replace --> is not going to work because its primitive data BUT
        //there is this manipulation with string methods using valueOf()
        String.valueOf(numbers2[1]).replace('2', '5');

    }
}
