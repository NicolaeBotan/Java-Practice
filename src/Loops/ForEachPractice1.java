package Loops;

public class ForEachPractice1 {
    public static void main(String[] args) {

        int[] numbers = {3,4,5,6,7,8,9,10};

        //we are using "for-each" loop

        for( int number : numbers){

            System.out.println(number);
        //no update statement needed, it will just go from beginning to the end of the array
        }
        //Example

        String[] items = {"Cup","Bottle","Microphone"};

        for( String str : items ){

            System.out.println(str);

        }
    }
}
