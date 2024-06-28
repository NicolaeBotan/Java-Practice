package recapWithAhmed;

import java.util.Scanner;

public class Loops {
    /*
    POSSIBLE INTERVIEW QUESTIONS:
          1- Many technical and automation questions are require loops.

          Types of loops:
              1- Do while loop --> No matter what it will run the code one time.
              2- While loop --> Will check the condition and run the code based on that.
              3- For loop --> It will initialize local variable, condition and Pre-Post Increment.(i++)(i--)
              4- For Each loop --> It will access all the data in the storage. Iterate one by one.
     */
    public static void main(String[] args) {
//        //DO-WHILE
//        // Write a code that only accepts userName that starts with Capital "A"
//        //this Do-While method is implemented when you need to execute the code at least one time.
//        String userName = "";
//        do {
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Please enter your userName");
//            userName = scanner.nextLine();
//            System.out.println(userName);
//        }while(userName.startsWith("A"));
//

        //WHILE LOOP
        //Ask the user to enter one int number
        //by using while loop and String
        //multiply the digits
        //EXP : 12345 --> FIRST OUTPUT= 54321 -->SECOND OUTPUT = 120

        //WHAT I WOULD DO IF I GOT THIS QUESTION:
        // 1- Always verify the question with the Interviewer
        // 2- Loudly you can think of the steps that you will follow
        // 3- Put the steps on your mind directly

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        //I will store the number
        int number = scanner.nextInt();
        //12345 ==> %10-->5  /10 -->1234-->%10 --> 4  /10 --> 123 etc. 1-->10 --> 0
        //we will create a String bucket to store the reverse numbers
        //also we will crete a bucket for multiplication
        String reverse = "";
        int multiplication = 1; //we put 1 at the beginning ,because any number multiply by 1 is the same number
        while(number!= 0){ //better always to say while number is not equal to 0
                           // when number becomes 0 the loop stops
            int digit = number %10;
            reverse += digit; //we store each digit in the reverse
            multiplication *= digit;//we multiply each digit
            number /= 10; //we add this to divide the number and get to the next digit 4, 3, 2, 1

        }
        System.out.println(reverse);
        System.out.println(multiplication);

    }
}
