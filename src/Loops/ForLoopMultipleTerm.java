package Loops;

public class ForLoopMultipleTerm {
    public static void main(String[] args) {


        //multiple conditions can be included and multiple updated statements

        for (int i = 0, k = 20, m = 15; i < k || k > m; i++, m++, k--) {

            System.out.println("i is --> " + i);
            System.out.println("k is --> " + k);
            System.out.println("m is --> " + m);
            System.out.println("++++++++++++");
        }

        int a = 1, b = 10, c = 20, count = 0;
        for (a = 25; a >= c; c++) {

            System.out.println(++count + " !!!!!!! " + b);
        }

    }
}
