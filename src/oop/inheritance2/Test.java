package oop.inheritance2;

public class Test {
    public static void main(String[] args) {


        Flower flower = new Flower("White");
        Rose rose = new Rose();
        System.out.println(flower.color);//White
        System.out.println(rose.color);//Red
        //because we initialized in the Rose Class with the
        // Constructor

        Rose rose1 = new Rose("Blue","Small",3.99);
        System.out.println(rose1.color);//null

        flower.run(3);
        rose1.run(6);



    }
}
