package arrays;

import java.util.Arrays;

public class Practice5 {
    public static void main(String[] args) {

        int[] numbers = {4, 3, 5, 6, 72, 6, 8, 45};
        System.out.println(numbers.length);//8 elements. size/count of elements.
        System.out.println(numbers[0]);// index 0, value is 4
        System.out.println(Arrays.toString(numbers));//[4, 3, 5, 6, 72, 6, 8, 45]

        //to reassign the value you just do this
        numbers[1] = 88; //giving a new value to the index position 1. was 3 now is 88
        System.out.println(numbers[1]);//88
        System.out.println(Arrays.toString(numbers));//[4, 88, 5, 6, 72, 6, 8, 45]

        //multiply each element by 10 and print out the results
        //[4, 88, 5, 6, 72, 6, 8, 45]
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] * 10);
        }
        //multiply numbers that are greater than 10 by 100 and print the result

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > 10) {
                System.out.println(numbers[i] * 100);
            }
        }

    }
}
