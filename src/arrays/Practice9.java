package arrays;

import java.util.Arrays;

public class Practice9 {
    public static void main(String[] args) {

        String[] brand = {"Nike", "Adidas", "Puma", "New Balance", "Rebook"};

        int[] numbers = {4, 3, 5, 6, 72, 6, 8, 45};

        //there is an Array class method called sort().
        //sort(). this method will sort your elements from smaller to larger

        System.out.println(Arrays.toString(numbers));//this will show my array in the same way
        //[4, 3, 5, 6, 72, 6, 8, 45]
        Arrays.sort(numbers);//this will sort the array
        System.out.println(Arrays.toString(numbers)); //this is after the array was sorted
        //result is [3, 4, 5, 6, 6, 8, 45, 72]

        Arrays.sort(brand);//this will sort the brands
        //by the alphabet , but first will go upper case then lower case conform ASCII table

        System.out.println(Arrays.toString(brand));//result is [Adidas, New Balance, Nike, Puma, Rebook]
    }
}
