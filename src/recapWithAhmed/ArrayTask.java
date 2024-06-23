package recapWithAhmed;

public class ArrayTask {
    /*
    Write an Implementation that will initialize in array and find:
    1- Sum of the even numbers
    2- Sum of the Odd numbers
    3- Difference between them(the answer shouldn't be minus)
     */
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 8, 12, 65, 76, 5, 22, 17};
        int sumEven = 0;//to store the even numbers
        int sumOdd = 0;//to store the Odd numbers

        for (int number : numbers) {
            if (number % 2 == 0) {
                sumEven += number;
            } else {
                sumOdd += number;
            }
        }
        int difference = sumOdd > sumEven ? sumOdd - sumEven : sumEven - sumOdd;//TERNARY OPERATOR
        System.out.println("Sum of Odd numbers is = " + sumOdd);//Sum of Odd numbers is = 91
        System.out.println("Sum of Even numbers is = " + sumEven);//Sum of Even numbers is = 120
        System.out.println("Difference between them is = " + difference);//Difference between them is = 29
    }
}
