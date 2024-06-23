package object;

import java.util.Arrays;

public class TestVeggie {
    public static void main(String[] args) {

        String[] items = {"red tomatoes", "green tomatoes", "green apple"};

        int count = MethodPractice3.veggieFilter(items);
        System.out.println(count);//2

        MethodPractice3 object1 = new MethodPractice3();
        object1.veggieFilter(items);//even if the method is static we can call the method by typing the method name

        String[] product = MethodPractice3.veggieFilter(items, 7);
        System.out.println(Arrays.toString(product));
        //[red tomatoes@gmail.com, green tomatoes@gmail.com, green apple@gmail.com]

    }
}
