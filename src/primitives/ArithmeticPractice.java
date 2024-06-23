package primitives;

public class ArithmeticPractice {
    public static void main(String[] args) {
        //Addition >> +
        int num1 = 10, num2 = num1 + 5;//(num2 is 15
        int result1 = num1 + num2;
        System.out.println(result1);//25
        //Subtraction >> -
        //num2 - num1
double result2 = num2 - num1;//5
        System.out.println(result2);//5.0 because is double
        int result3 = 7 - 3;
        System.out.println(result3);
        // Multiplication >> *
        int count1 = 2;
        int count2 = 5;
        System.out.println(count2 * count1);
int result4 = count1 * count2;//10
        System.out.println(result4);
        System.out.println( result4 == (count1 * count2)  );//true (because comes as boolean) ==
        System.out.println( (result4 + 10 + result4) == (count1 + count2) ); //false
        // Division --> /
        int result5 = count2 / count1;
        System.out.println(result5);// 2 because data type is int only whole numbers

        double result6 = count2 / count1;
        System.out.println(result6);//2.0 because initial variables are created as int but result is
                                    // stored as double
        double number1 = 11;
        double number2 = 2;
        double divide = number1 / number2;
        System.out.println(divide);// 5.5 because the variables are created as double and result is stored
                                   // as double as well





    }


}
