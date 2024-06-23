package Loops;

public class WhilePractice1 {
    public static void main(String[] args) {
    //print "Hello" 10 times
        // System.out.println("Hello");
        int count = 0;
        while ( count < 10 ){     //it will print until count multiplies 10 times, and it will stop
                                  //because we used inside the loop count++
            System.out.println(count);
            System.out.println("Hello");
            count++; //update statement
        }
        int count1 = 1;//we use this one to print the count of the "Bye" Ex: "1 Bye, 2 Bye,etc
        int number = 20;
        while ( number > 10 ){

            System.out.println( count1++ + " Bye");
            number--;// it will subtract -1 every time it runs this while statement until number
                     // will be equal with 10 and it will make the condition FALSE
        }

    /*         //infinite loop , because the condition will be always TRUE
          while ( 6 == 6 ){
          System.out.println("Java is favorite");
          }
     */

    }
}
