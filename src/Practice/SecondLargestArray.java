package Practice;

import java.util.Arrays;

public class SecondLargestArray {
    public static void main(String[] args) {
        /*
        // find the largest and second-largest number in the array
            int[] array = {10, 30, 20, 45, 35};
         */
        int[] array = {10, 20, 45, 32, 15};
        Arrays.sort(array);//to sort it ascending order
        System.out.println(Arrays.toString(array));
        int largest = array[0];
        int secondLargest = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > largest) {
                secondLargest = largest;
                largest = array[i];
            } else if (array[i] > secondLargest) {
                secondLargest = array[i];
            }
        }
        System.out.println(largest);
        System.out.println(secondLargest);

    }
}
