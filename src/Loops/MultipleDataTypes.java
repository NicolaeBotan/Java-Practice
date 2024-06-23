package Loops;

public class MultipleDataTypes {
    public static void main(String[] args) {

        double d1 = 5.5;
        int i = 0;

        for( i = 1 , d1 = 9.9; i <= 5 || d1 > 0; i++, d1--){
            //ones the variables were created outside the loop
            //you can reassign them inside the loop, but you can not create different data types inside the for
            //loop. d is just a local variable.

            double d = 2.5;//local variable
            System.out.println("Practice");

        }



    }
}
