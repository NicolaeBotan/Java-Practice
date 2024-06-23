package arrays;

import java.util.Arrays;

public class MultiDimensionalPractice3 {
    public static void main(String[] args) {

        String[][][] items = {{{"car", "doll"}, {"abc","napkins"}}, {{"napkins"}, {}}, {{"napkins"}}};

        System.out.println(Arrays.deepToString(items)); //return is
        //[[[car, doll], [abc]], [[], []], [[napkins]]]

        for (String[][] one : items) {

            for (String[] two : one) {

                for (String items1 : two) {

                    if (items1.equalsIgnoreCase("napkins")) {

                        System.out.println("You got the napkins");
                        break;
                    } else {
                        System.out.println(items1);
                    }

                }

            }
        }

    }
}
