package arrays;

import java.util.Arrays;

public class MultiDimensionalPractice1 {
    public static void main(String[] args) {

        int[][] numbers = new int[4][3];
        // lets store some data

        numbers[0][0] = 73;
        numbers[0][1] = 81;

        //to show multiple Arrays in Array the printout is "deepToString()
        System.out.println(Arrays.deepToString(numbers));//result is
        // [[73, 81, 0], [0, 0, 0], [0, 0, 0], [0, 0, 0]]

        //Task
        //store 95 in the last index of 3rd element in the 1st Array
        //[[73, 81, 0], [0, 0, 0], [0, 0, 95], [0, 0, 0]]
        numbers[2][2] = 95;
        System.out.println(Arrays.deepToString(numbers));//return is
        //[[73, 81, 0], [0, 0, 0], [0, 0, 95], [0, 0, 0]]

        //Task --> store 100 to the last index
        numbers[3][2] = 100; //make this dynamic index

        System.out.println(Arrays.deepToString(numbers));//return is
        //[[73, 81, 0], [0, 0, 0], [0, 0, 95], [0, 0, 100]]

        // to make this dynamic we will do the following

        numbers[numbers.length - 1][numbers[numbers.length - 1].length - 1] = 111;//reassign the value 111
        System.out.println(Arrays.deepToString(numbers));//return is
        //[[73, 81, 0], [0, 0, 0], [0, 0, 95], [0, 0, 10]]

        //Task
        //add 1000 to every single number and printout

        for (int i = 0; i < numbers.length; i++) {

            System.out.println(Arrays.toString(numbers[i]));

            for (int k = 0; k < numbers[i].length; k++) {

                System.out.println((numbers[i][k]) + 1000);
            }
        }
        //Task: same task using "for-each loop"
        //[[73, 81, 0], [0, 0, 0], [0, 0, 95], [0, 0, 111]]

        for (int[] arr : numbers) {

            for (int number : arr) {

                System.out.println(number + 1000);

            }
        }


    }
}
