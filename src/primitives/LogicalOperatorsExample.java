package primitives;

public class LogicalOperatorsExample {
    public static void main(String[] args) {
 /*Task: create a class in INTELLij to solve
you need to have average of 60% to pass a class
when you get 3 tests
our range for tests scores is 0 to 100
AND
you need to have 90% attendance */

        int test1 = 50;
        int test2 = 100;
        int test3 = 80;
        int requiredAverageScore = 60;
        int requiredAttendance = 90;
        int myAttendance = 100;
        int average;
        average = (test1 + test2 + test3) / 3;//to find the average
        boolean result = average >= requiredAverageScore && myAttendance >=requiredAttendance;
        //both are true && true so the final result is true
        System.out.println(result);//true




    }
}
