package primitives;

public class RemainderPractice1 {
    public static void main(String[] args) {

        // remainder --> % remainder/modulus operator  will find left over from a division question

        int number1 = 17, number2 = 5;
        int r1 = number1 % number2;

        System.out.println( r1 + " is the leftover from dividing " + number1 + " by " + number2);

        int number3 = 123;
        //find the remainder of 123 when divided by 10
        int number4 = 10;
        int r2 = number3 % number4;
        System.out.println(r2 + " is the leftover from dividing " + number3 + " by  " + number4 );
        System.out.println(number3 % 100); //23
        System.out.println(21 % 10);//1
        System.out.println( 3214 % 10 );//4
        System.out.println( 2007 % 10 );//7



    }


}
