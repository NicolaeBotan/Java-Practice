package ifStatement;

public class ElseIfPractice3 {
    public static void main(String[] args) {
/*
TASK
-there are 3 tests for a class
-to get letter scores for averages
-use the following scale
90 - 100 -->A
80 - 89 -->B
70 - 79 -->C
60 - 69 -->D
less than 60 --> please come again
 */
           int test1 = 95;
           int test2 = 83;
           int test3 = 75;
           int result = (test1 + test2 + test3) / 3;

           if( result >= 90 && result <= 100) {
               System.out.println("Your score is " + result +" A ");
           }else if( result >= 80 && result <= 89) {
               System.out.println("Your score is " + result +" B ");
           }else if( result >= 70 && result <= 79){
               System.out.println("Your score is " + result +" C ");
           }else if( result >= 60 && result <= 69){
               System.out.println("Your  score is " + result +" D ");
           }else{
               System.out.println("Please come back again");
           }










    }
}
