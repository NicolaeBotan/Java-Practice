package exeptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) throws FileNotFoundException, InterruptedException {//putting the throws
        //is another way to handle the exception on the method signature level
        //you can handle the exceptions on the method level


        //this implementation will read the data from a file "Test"
        FileInputStream stream = new FileInputStream("Test");

        Scanner scanner = new Scanner(stream);

        while (scanner.hasNext()) {
            System.out.println(scanner.next());
            System.out.println("$");//because its scanner.nest the $ will appear after each word

            //another method
            //this method will wait for every single cycle of the loop
            //so, it will wait 3 second after each loop/ or word
            //this sleep method is taking milliseconds as parameter
            Thread.sleep(300);//also thrown InterruptedException to the method signature

        }
        //"throw" example
        int number = 25;
        int day = 26;

        if (day < number) { //the if statement is always true
            //if the condition is false we are not going to see the exception

            throw new RuntimeException();//this will throw the RunTImeException
        }
        System.out.println("This is final example");//This is final example

    }
}
