package ifStatement;

public class ElseIfPractice1 {
    public static void main(String[] args) {
        /*
        pick a number between 0 - 15
        if the number is 0 - 5 --> your number is in the range of 0 to 5
        if the number is 6 - 10 --> your number is in the range of 6 and 10
        if the number is 11 - 15 --> your number is in the range of 11 and 15
         */
        int number = 7; //if number is not in the range 0 -15 then it will say "Out of Range
        if( number >= 0 && number<=5 ){
            System.out.println("your number is in the range of 0 to 5");
        }else if( number > 5 && number <= 10 ) {
            System.out.println("your number is in the range of 6 and 10");
        }else if( number > 10 && number <= 15){
            System.out.println("your number is in the range of 11 and 15");
        }else{
            System.out.println("Out of range");//only when the number is not in the range 0 - 15
        }


    }
}
