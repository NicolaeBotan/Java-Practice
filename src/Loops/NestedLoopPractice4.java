package Loops;

public class NestedLoopPractice4 {
    public static void main(String[] args) {
        /*
        create multiplication number from 1 to 5
        1*1=1
        1*2=2
        ...
        1*10=10
        ------
        5*10=50
         */

        for (int num = 1; num <= 5; num++) {

            for (int multiplier = 1; multiplier <= 10; multiplier++) {

                System.out.println(num + " * " + multiplier + " = " + num * multiplier);
            }
            System.out.println();
        }
    }
}
