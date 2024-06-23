package Loops;

public class ForEachPractice3 {
    public static void main(String[] args) {

        double[] change = {2.34, 4.5, 1.25, 3.40, 1.20};
        //using for-each loop find the total of change

        double total = 0;// creating a variable where I will store the total

        for (double item : change) { //this will take each individual item from change array

            total += item;//this will add each item to the total variable

            System.out.println(total);//it will show the total after each loop or each addition
        }
        System.out.println(total);

        //---------------------------------
        //Example

        // find the missing number from the pattern
        int[] numbers = {1, 2, 3, 5, 6, 7};
        //we will use regular "for-loop" method

        for (int i = 0; i < numbers.length - 1; i++) {

            if (numbers[i + 1] - numbers[i] > 1) { //here we subtract from the bigger number the smaller and find
                // if the difference is 1, if not that's the missing number
                System.out.println(numbers[i] + 1);//then show the i plus one
            }
        }
        //Different way to solve this task/  better approach
        //{1,2,3,5,6,7}; only when you have one missing number
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {

            sum += numbers[i];//to find the sum from the given array without missing number
        }
        int sum2 = 0;
        for (int i = 0; i <= 7; i++) {

            sum2 += i;//to find the sum of the pattern up to 7 inclusive because this is the last value in the
            //array, so then we will subtract from sum2 the sum to find the difference and that is our number
        }
        System.out.println("Sum 1 = " + sum);
        System.out.println("Sum 2 = " + sum2);
        System.out.println("Missing number is " + (sum2 - sum));//to find the difference

    }
}
