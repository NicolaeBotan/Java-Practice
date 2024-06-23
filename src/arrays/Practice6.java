package arrays;

public class Practice6 {
    public static void main(String[] args) {

        int[] ages = {21, 23, 27, 27, 23, 27, 30, 35, 34, 18, 38, 19};
        //find the oldest age
        int largest = ages[0];//just for the begging let the largest value be 21 because is the first index

        for (int i = 0; i < ages.length; i++) {

            if (ages[i] > largest) {
                largest = ages[i];  //if ages[i] is larger than my "largest",swap/reassign them
            }
        }
        System.out.println(largest);

    }
}
