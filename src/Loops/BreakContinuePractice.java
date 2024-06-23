package Loops;

public class BreakContinuePractice {
    public static void main(String[] args) {

        for (int i = 0; i < 16; i++) {

            System.out.println(i);
            break;// means stop so it will print ones
            //System.out.println(i); anything after break statement after can not be executed in that block
        }
        System.out.println("++++++++");//this is outside the block so it will be printed


        for (int i = 0; i < 16; i++) {
            System.out.println(i);

            if (i > 9) { //this means when i becomes 10 the break will activate and stop the loop
                break;
            }
        }       /*
              1 * 2 = 2
              1 * 3 = 3
              1 * 4 = 4
              1 * 5 = 5
        */
        for (int num = 1; num <= 5; num++) {

            for (int multiplier = 1; multiplier <= 10; multiplier++) {

                System.out.println(num + " * " + multiplier + " = " + num * multiplier);

                if (multiplier == 5) {

                    break;// it will be multiplied until multiplier becomes 5, and it will stop the loop
                }
            }
            System.out.println("+++++++++++++++++++++++++++++++++++");


            for (int i = 0; i < 16; i++) {
                if (i > 9 && i < 12) {

                    continue;   //this condition is used to skip this condition
                    //breaks this condition and then continues i>9 && i<12(skips these)
                }
                System.out.println(i + "-Hello"); //so 10-Hello and 11-Hello will be skipped
            }
        }
    }
}
