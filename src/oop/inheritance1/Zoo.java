package oop.inheritance1;

public class Zoo {

    //this class was created to call the rest of the
    //Animal classes
    public static void main(String[] args) {

        Animal animal1 = new Animal();
        System.out.println(animal1.color);//

        WildAnimal wild = new WildAnimal();//calling from
        //Animal class
        System.out.println(wild.color);//

        Lion lion = new Lion();
        System.out.println(lion.color);//
        System.out.println("+++++++++");
        lion.color = "Brownish";//reassigning
        System.out.println(lion.color);
        DomesticAnimal domestic = new DomesticAnimal();
        System.out.println(domestic.color);
        Cat cat = new Cat();
        System.out.println(cat.color);

        //methods
        animal1.eat();
        wild.eat();
        domestic.eat();
        lion.eat();
        cat.eat();

        //giving names
        animal1.name = "Father";
        System.out.println(animal1.name);
        animal1.eat();
        lion.name = "Simba";
        lion.eat();
        System.out.println("==========");
        animal1.sleep();
        wild.sleep();
        animal1.speak();
        wild.speak();
        lion.speak();

        System.out.println(domestic.hasToy);
        System.out.println(cat.hasToy);

        cat.name = "Richard";
        domestic.name = "Gregory";
        domestic.play();//Gregory is playing
        cat.play();//Richard is playing

    }
}
