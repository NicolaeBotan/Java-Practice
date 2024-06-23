package Ternary;

public class Practice1 {
    public static void main(String[] args) {
        //boolean condition  ?  value1  : value2 ;

        int a = 16, b = 7;
        int result = a < b ? a + b : a * b;// cond its TRUE so it will do a + b//result is 13
        System.out.println(result);//13

        String result1 = a != b ? "Addition" : "Multiplication";
        System.out.println(result1);//"result is Addition

        System.out.println(a >= b + 9 ? 'c' : "check");
      // String result3 = a >= b + 9 ? 'c' : "check"; since data types of the options are different we can not
        //                                                                                            store it

        String str1 = "I am so lucky";
        String str2 = "It is going great";
        String day = "Sunday";
        System.out.println(day.equals("Monday") ? str2 : str1);//FALSE so result is str1
        System.out.println("a is " +a);//16
        System.out.println("b is " +b);//7
        System.out.println( a > b ? ++a + ++b : --a + --b ); //true so 17 + 8 = 25 result
        /*
        so the values are changed to a=17 and b=8// we applied the option1 ,but we did not store the result
         */
        System.out.println("a is " +a);//17
        System.out.println("b is " +b);//8

        //Nested Ternary
        //a > b ? ++a + ++b : --a + --b // we will use this instead of str1
        //day.equals("Monday") ? str2 : str1
        //day.equals("Monday") ? str2 : a > b ? ++a + ++b : --a + --b

        System.out.println(day.equals("Monday") ? str2 : a > b ? ++a + ++b : --a + --b ); //result is 27
        // so first condition is False, we will look at second condition (a>b) that is TRUE, so we will
        // execute ++a + ++b ,witch is 18 + 9 = 27
        // */



    }
}
