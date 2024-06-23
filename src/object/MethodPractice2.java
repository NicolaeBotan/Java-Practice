package object;

import java.util.Scanner;

public class MethodPractice2 {
    public static void main(String[] args) {
        MethodPractice2 john = new MethodPractice2();
        double call1 = john.test1(3.2, 1.8, "multiply");
        System.out.println(call1);//5.76

        double call2 = john.test1(4, 4.5, "add");
        System.out.println(call2);//8.5

        //Age task
        john.ageCalculator(2024, 1994);
        john.ageCalculator();

        //to trigger the method with the scanner we do this, we force to use the year as short
        short a = 2024;
        john.ageCalculator(a);//Your age is 30


    }


    //create a method that will take 2 double numbers and an operation name
    //this method will return the result
    // operation --> addition or multiplication

    public double test1(double num1, double num2, String operationName) {
        if (operationName.equalsIgnoreCase("multiply")) {
            double result = num1 * num2;
            return result;
        } else {
            double result2 = num1 + num2;
            return result2;
        }
    }

    //create a method that will find out your age
    //return and print the age
    public int ageCalculator() {
        //current year - birth year
        int age = 2022 - 2003;
        System.out.println("Your age is " + age);
        return age;
    }

    public short ageCalculator(int birthYear) {
        short age = (short) (2022 - birthYear);
        System.out.println("Your age is " + age);
        return age;
    }

    public int ageCalculator(int currentYear, int birthYear) {

        int age = currentYear - birthYear;
        System.out.println("Your age is " + age);
        return age;
    }

    public int ageCalculator(short currentYear) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your birth year?");
        int birthYear = scanner.nextInt();
        int age = currentYear - birthYear;
        System.out.println("Your age is " + age);
        return age;
    }


}
