package primitives;

public class UnaryOperators {

    public static void main(String[] args) {
        int studentNumber = 23;
        System.out.println(studentNumber);//23
        studentNumber++;
        System.out.println(studentNumber);//24
        ++studentNumber;
        System.out.println(studentNumber);//25
//====================================================
        System.out.println("========================");
        System.out.println(studentNumber++ ); //25 (java will use the studentNumber but will not increase)
                                             // (it will increase next time you use it)
        System.out.println(studentNumber);//26 (because java has added the 1 but didnt show)
        System.out.println(studentNumber);//26

        System.out.println("========================");

        System.out.println( ++studentNumber);//27 because it was increased first and then used
        System.out.println(studentNumber);//27

        studentNumber++;//28 because this is done ,1 is added automatically
        System.out.println(studentNumber);//28
        //println is just showing the results
        System.out.println(studentNumber++ );//shows 28 but value became 29 behind the scene
        System.out.println(studentNumber);//29
       //===========================================================================

       int number = 12;
       //preDecrement
        --number;
        System.out.println(number); //11 because the decrement was done
        //postDecrement
        number--;
        System.out.println(number); //10 because the statement was done (number--;)

        //difference between pre and post only can be shown inside System.out.println
        System.out.println( --number); //9 because it does the decreasing and it shows after
        System.out.println(number);//also 9 because nothing changed
        System.out.println(number -- );//shows 9 but value is 8 behind the scene
        System.out.println(number); //value is 8









    }
}
