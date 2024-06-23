package exeptions;

public class Practice2 {
    public static void main(String[] args) {
        //when you put RuntimeException in the catch block, it will catch all the exceptions after will run
        //the code and there is no need of multiple catch blocks
        //catch block exception should go from lower to the larger type
        //so if the lower Exception can not catch,the parent/larger type will catch the Exception
        //if you will have multiple catches you should go from lower level to larger level of Exceptions
        try{
            System.out.println("FIRST");

            String str = "b15";
            int result = 15 / 0;//ArithmeticException

            System.out.println("SECOND");

            int number = Integer.parseInt(str);//NumberFormatException
            System.out.println("THIRD");

        }catch (NumberFormatException e){
            System.out.println("Catch");

            //you can implement multiple catches
        }catch (ArithmeticException e1){ //so if it will find this exception first,it will run only what's
            // inside, of the specific catch block
            System.out.println("Catch 2");
        }finally {
            System.out.println("---------------");
        }
        //totally a different logic, we will reach this one with the help of try and catch
        //if there were no try and catch method, the code will stop at the first exception
        //we reverse one String
       try{
           String str = "Last";
           String reversed = "";
           for(int i = str.length(); i > 0; i--){ //StringIndexOutOfBoundsException
               reversed += str.charAt(i); //Index 4 out of bounds for length 4
           }
           System.out.println(reversed);//tsaL

       }catch (StringIndexOutOfBoundsException e ){
           System.out.println(e.getMessage());
       }finally {
           System.out.println("==============");
       }
        System.out.println("*********");
    }
}
