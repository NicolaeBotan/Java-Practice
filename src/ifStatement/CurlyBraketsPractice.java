package ifStatement;

public class CurlyBraketsPractice {
    public static void main(String[] args) {

        if( 5 == 5 )    //condition is TRUE so it will run both

            System.out.println("Hi");
        System.out.println("Hello");

        System.out.println("+++++++++++++++++++++++++++++++++++++");

        if( 5 == 8 )    //condition is False so the first statement is skipped
            System.out.println("Hi");//first statement
        System.out.println("Hello");// second statement

        /* WHEN WE ARE NOT USING CURLY BRACKETS THE BASED ON CONDITION ONLY THE FIRST STATEMENT
         WILL BE AFFECTED */

     /*   if( 5 == 8 );  //if you put semicolon after condition means the statement is done, so it will
                           run the both System.out.println (so don't put semicolon)

            System.out.println("Hi");
        System.out.println("Hello"); */


    }
}
