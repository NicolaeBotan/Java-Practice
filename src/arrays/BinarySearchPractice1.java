package arrays;

import java.util.Arrays;

public class BinarySearchPractice1 {
    public static void main(String[] args) {

        String[] drinks = {"tea", "water", "coffee", "coke"};

        Arrays.binarySearch(drinks, "water");
        System.out.println(Arrays.binarySearch(drinks, "water"));//return 1

        Arrays.sort(drinks);
        System.out.println(Arrays.binarySearch(drinks, "water"));//return 3

        //Example
        int[] numbers = {3, 6, 8, 10, 2, 11};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));//return after sorting [2, 3, 6, 8, 10, 11]
        System.out.println(Arrays.binarySearch(numbers, 8));//return index 3


    }
}
