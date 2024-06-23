package exeptions;

public class Practice3 {
    public static void main(String[] args) {
        //create a method
        //this method have some implementation
        //there will be a type of exception in your logic
        //handle that exception with try-catch blocks
        System.out.println("First line");
        practice();
        System.out.println("After method call");
        //we will see all 3 printouts because we used try-catch method and because of this the code
        //will find the exception and kept going through the code
    }
    public static void practice(){
        try{

            int[] arr = {1,2,3,4,5};
            System.out.println(arr[6]);

        }catch (ArrayIndexOutOfBoundsException ex ){
            System.out.println("I caught an exception");
            //this finally block will be also triggered after the catch worked, they are working together
            //finally block should be with try and catch, and you can have only one finally block
            //for every try block
        }finally {
            System.out.println("Finally Block");
        }
    }




}
