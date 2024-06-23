package recapWithAhmed;

import java.util.Arrays;

public class Exceptions {
    /*
    POSSIBLE INTERVIEW QUESTIONS:
         1- How do you handle Exceptions?
              --> We can handle the Exceptions with TRY and CATCH, THROWS.

         2- Can you use more than one catch block? How about try block?
              --> You can use more than one CATCH BLOCK but only ONE TRY BLOCK.

         3- What do you know about final,finalize,finally? (MOST COMMON QUESTION)
              --> FINAL is a keyword to make the Variable or Method or Class unchanged.(Last Version)
              --> FINALIZE is a method to clean up the unused/useless data(GARBAGE COLLECTOR)
                    for proof that GC works we override the finalize() method.
              --> FINALLY is a block that comes after TRY AND CATCH block to do final execution no matter
              what.

         4- What is the difference between "THROW" and "THROWS"?
              --> Both Throw and Throws are the concept of Exception handling in which throws I used to
              explicitly(out of block) throw the Exception from a method.

          -->public void exception() throws NumberFormatException
                      //Outside the block

          -->public void exception2(){
          new throw NumberFormatException(e);
          }     //Inside the block

          *** While THROWS are used next to the Method Signature(OUTSIDE THE BLOCK)
          *** THROW is used inside the Block.
     */

    public static void main(String[] args) throws InterruptedException { //Throws comes here

        String numbers = "$199";

//        System.out.println(numbers);//$199
//
//        int price = Integer.parseInt(numbers);//NumberFormatException
//        //BECAUSE THE STRING HAS A SYMBOL NOT ONLY NUMBERS, AND GIVES THE EXCEPTION WHEN YOU TRY TO
//        //PARSE STRING IN TO INTEGER.
//
//        System.out.println(price);

        try {
            System.out.println(numbers);//$199
            int price = Integer.parseInt(numbers);//NumberFormatException
            System.out.println(price);

        } catch (NumberFormatException ex) {
            System.out.println("Your price parsing is not working");
            System.out.println(Arrays.toString(ex.getStackTrace()));//to get all the details about the Exception
             throw new NumberFormatException();
        } finally {
            System.out.println("I am the finally Block");
        }

        Thread.sleep(3000); //make it sleep for 3 seconds
    }
}
