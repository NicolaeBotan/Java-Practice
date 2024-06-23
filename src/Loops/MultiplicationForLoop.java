package Loops;

public class MultiplicationForLoop {
    public static void main(String[] args) {
        /*
        print out multiplication table
        1*1=1
        1*2=2
        1*3=3
        ...
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
