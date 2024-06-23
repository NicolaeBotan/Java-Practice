package arrays;

import java.util.Arrays;

public class Practice2 {
    public static void main(String[] args) {
        int[] numbers = new int[10];

        numbers[8] = 12;
        numbers[5] = 88;
        numbers[2] = 11;
        numbers[6] = 55;
        numbers[0] = 72;
        System.out.println(Arrays.toString(numbers));//[72, 0, 11, 0, 0, 88, 55, 0, 12, 0]
        System.out.println(numbers[2]);//11

        // reach every element and say hi
        // [72, 0, 11, 0, 0, 88, 55, 0, 12, 0]

        for (int i = 0; i < numbers.length; i++) {

            System.out.println("Hi " + numbers[i]);
        }
        System.out.println("++++++++++++++++++++++++++++++++++");
        //print out "Bye" if the element is greater then 50

        for (int i = 0; i < numbers.length; i++) {

            if( numbers[i] > 50 ){
                System.out.println("Bye - " + numbers[i]);
            }else{

                System.out.println("Hi - " + numbers[i]);
            }

        }
    }
}
