package scannerPractice;


import java.util.Scanner;

public class BMIcalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//"scanner" is the name of the scanner
                                                  // can be any name
        System.out.println(" What is your weight?");
        double weight = scanner.nextDouble(); //"scanner" is the name of the scanner//can use any name
        System.out.println(weight);
        System.out.println("What is your height?");
        double height = scanner.nextDouble();// "scanner" is the name of the scanner//can use any name
        System.out.println(height);
        double bmi = weight / (height * height);
        System.out.println("Your Body Mass Index is " + bmi );


    }
}
