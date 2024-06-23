package arrays;


import java.util.Arrays;

public class Practice1 {
    public static void main(String[] args) {
        /*
        store 5 different ages in one array
         */
        int[] ages = new int[5]; //5 is the size of array. It can be any number.

        System.out.println(ages);//will return a code of the position in the memory of this Array

        System.out.println(Arrays.toString(ages));//will return [0, 0, 0, 0, 0] by DEFAULT
        //because there are no values yet in the ages Array, so Java returns 0 for every position of the 5

        ages[0] = 25;
        ages[1] = 9;
        System.out.println(Arrays.toString(ages));// returns [25, 9, 0, 0, 0]

        //store 89 in to the last position
        ages[4] = 89; // index number is 4
        System.out.println(Arrays.toString(ages));// returns [25, 9, 0, 0, 89]

        //ages[5] = 100;//ArrayIndexOutOfBoundsException
        System.out.println(Arrays.toString(ages));//this printout is to print the whole ARRAY

        //String str = "abcd";
        //System.out.println(str.charAt(7));//StringIndexOutOfBoundsException

        System.out.println(ages[1]);// returns 9 , the value of the index 1

        //reassigning the value
        ages[0] = 35;
        System.out.println(Arrays.toString(ages));//[35, 9, 0, 0, 89] instead of 25 is 35 now

        System.out.println(ages[4]);//89
        System.out.println(ages[ages.length - 1]);//89, the index is dynamic .to reach the last index
        //length in this case is a property that comes from the array
        System.out.println(ages.length);//5,how many elements we have in our array

    }
}
