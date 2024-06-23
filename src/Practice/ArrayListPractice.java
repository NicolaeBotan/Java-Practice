package Practice;

public class ArrayListPractice {
    public static void main(String[] args) {
        int[] array = {10, 20, 34, 56, 89, 19};

        System.out.println(array[3]);
        System.out.println(array[1] + array[2]);//54
        // System.out.println(array[6]);//ArrayIndexOutOfBoundsException

        int sum = 0;

        for (int i : array) {
            System.out.println("sum is " + sum + " adding " + i);
            sum += i;
        }

        System.out.println(sum);
    }
}
