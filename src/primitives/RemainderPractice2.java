package primitives;

public class RemainderPractice2 {
    public static void main(String[] args) {
        //int number = 123; sum of digits from given number 1 + 2 + 3 = 6

        int number = 123;
        System.out.println("number is " + number);
        int digit1 = number % 10;
        System.out.println("digit1 is " + digit1);//3
        number = number / 10; //reassigning the value//12
        System.out.println("Number is now " + number);//12
        int digit2 = number % 10 ;//2
        System.out.println("digit2 is " + digit2);//2
        number = number / 10;//1
        System.out.println("Number is now " + number);//1

        int sum = digit1 + digit2 + number;
        System.out.println("the sum of digits is " + sum );







    }

}
