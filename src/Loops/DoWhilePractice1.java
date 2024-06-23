package Loops;

public class DoWhilePractice1 {
    public static void main(String[] args) {
        /*
        print "***" for 10 times with WHILE loop
         */
        int print = 1, last = 10;

        while (print <= last) {

            System.out.println("* * *");
            print++;

        }

        // "***" for ten times with DO-WHILE loop
        print = 1;
        last = 10;

        do {
            System.out.println("***");
            print++;

        } while (print <= last);// IF this condition will be false, it will still execute the sout 1 time

        ///EXAMPLE

        int x = 5, y = 20;
        do {
            System.out.println("Hello it is DO-WHILE");
            //x++;
            y--;

        } while (y > x);
        //=======================================
        do {
            System.out.println("Hello it is DO-WHILE - 2");
                              //so here we will see the "Hello it is DO-WHILE - 2" only one time
            y--;

        } while (y > x);//this is already "false" because y = 5, so it's not > then x


    }
}
