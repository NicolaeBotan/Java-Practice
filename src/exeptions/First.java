package exeptions;

public class First {
    public static void main(String[] args) {

        //RUN TIME EXCEPTION
        try {
            int number = 10;
            String str = "15";
            int num = Integer.parseInt(str);//converting the String str in Integer
            num += 10;
            System.out.println(num);

            int result = number / 0;//ArithmeticException
            System.out.println(result);
            //ArithmeticException because // you can not divide by 0
            //AS SOON AS JAVA SEE THE EXCEPTION IT JUMPS TO CATCH, SO IT'S NOT RUNNING
            //THE CODE THAT IS AFTER EXCEPTION IN THE TRY BLOCK
            System.out.println("I like Java");
        } catch (ArithmeticException ignored1) { //in the parenthesis we can put Throwable,RunTime Exception
            System.out.println("I caught Exception");
            //printing the message
            System.out.println(ignored1.getMessage());// by zero
        }
        System.out.println("I like Math");
    }
}
