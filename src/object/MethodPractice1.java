package object;

//OVERLOADING THE METHOD

public class MethodPractice1 {
    //create a method that will add 2 int numbers together
    // will return the sum

    public int sumCalculator(int num1, int num2){

        int sum = num1 + num2;
        System.out.println("Two int parameter is running");
        return sum;
        //return sum1 + sum2; can be also possible
    }
    public int sumCalculator(int num1,int num2,int num3){
        System.out.println("Three int parameter is running");
        int sum = num1 + num2 + num3;
        return sum;
    }
//overload sumCalculator method to find the sum of numbers from given Array
    public int sumCalculator(int[]numbers){
        //{3,4,5,6,7}
        int sum = 0;
        for ( int num : numbers){
            sum = sum + num;
        }
        return sum;
    }

    public static void main(String[] args) {

        MethodPractice1 object = new MethodPractice1();

        int total1 = object.sumCalculator(3,5);
        System.out.println(">>>>>>>> " +total1);

        int total2 = object.sumCalculator(3,34,11);
        System.out.println("---> " + total2);

        int[] arr = {2,4,5,8};
        int total3 = object.sumCalculator(arr);
        System.out.println(total3);//19--> sum of the numbers in arr array

        System.out.println(object.sumCalculator(new int[]{3,4,5}));//12 (another way to run this method)


    }

}
