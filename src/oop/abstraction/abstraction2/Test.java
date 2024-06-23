package oop.abstraction.abstraction2;

public class Test {
    public static void main(String[] args) {

        //YOU CAN NOT CREATE AN OBJECT FROM INTERFACE

        Bird bird = new Bird();

        bird.eat();//Bird eats
        System.out.println(bird.TAIL);//1

        //we can reach  Static instance variables also by
        //calling them using the class name

        System.out.println(CanFly.WING);//2

        //creating a Dolphin Object

        Dolphin dolphin = new Dolphin();
        dolphin.swim(3);//Dolphin swims this deep 3 miles
        System.out.println(dolphin.FIN);//true
        //reaching by class name CanSwim
        System.out.println(CanSwim.FIN);//true

        //is there any other way that I can still create a Dolphin
        //Object
        CanSwim dolphin2 = new Dolphin();
        //Parent class, name = new Child Class.

        dolphin2.swim(4);//Dolphin swims this deep 4 miles
        CanFly bird2 = new Bird();
        bird2.fly();//Bird is in the air

        //WE CREATE A DUCK OBJECT THAT CAN DO MANY THINGS
        //FROM BOTH INTERFACES

        Duck duck = new Duck();
        duck.fly();//Duck is in the Air
        duck.landing(50);//Duck is coming down
        duck.swim(5);//Duck is swimming

        //CAN I CREATE DUCK OBJECT IN A DIFFERENT WAY

        CanSwim duck1 = new Duck();
        CanFly duck2 = new Duck();
        //in this case these are duck Objects from interface Parent
        duck1.swim(4);
        duck2.fly();

        Duck duck3 = new Duck();
        duck3.run();//null is Running
        duck3.color = "White";
        duck3.run();//White is Running

        duck3.printInfo();


    }
}
