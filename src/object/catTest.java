package object;

public class catTest {
    public static void main(String[] args) {

        Cat animal = new Cat();

        animal.color = "brown";
        animal.age = 6;
        animal.name = "Tom";
        System.out.println(animal.foodAmount);//20
        animal.foodAmount = 40;
        System.out.println(animal.foodAmount);//40
        //create a method that will print out
        //" Tom is sleeping"
        // use the method in the Test class
        animal.sleep();//Tom is sleeping

        Cat animal2 = new Cat();

        animal2.sleep();//null is sleeping
        //because we did not assign any name to animal2

        animal.run();//3 is behind the scene

        int number = animal.run();
        System.out.println(number);
        //however manu miles tom runs,give him 500 dollars per mile
        System.out.println(animal.run() * 500);

        String walking = animal.walk("west");
        System.out.println(walking);//Tom is walking west
        System.out.println(animal.walk("to down town"));
        //Tom is walking to down town

        // System.out.println(animal.sleep());
        //methods with 'void' return type can not be called in
        //sout

        //use setColor method

        animal.setColor("blue");
        System.out.println(animal.color);//blue

        System.out.println(animal2.color);//null
        //because we did not assign anything to animal2
        String catColor = animal.getColor();
        System.out.println(animal.getColor());//blue
        System.out.println(catColor);//blue

        // print allInfo

       // animal.allInfo();//Tom - blue - 6 - 40
        String info = animal.allInfo();
        System.out.println(info);
        // return is *******Tom - blue -  - 6 - 40*******

        //Task plus 10 on age
        animal.setAge(12);
        animal.getAge();
        System.out.println("In 10 years your age will be " +(animal.getAge()+10));


    }
}
