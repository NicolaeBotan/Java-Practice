package object;

public class AnimalTest {
    public static void main(String[] args) {
        //we can bring any info from the other class by creating an object in this class

        AnimalClass animal1 = new AnimalClass();//representative of the AnimalClass

        System.out.println(animal1);//return object.AnimalClass@5f184fc6 (location where its stored)

        System.out.println(animal1.name);//return is "null" because its default value
        //we didn't assign any name in the previous class(AnimalClass)
        System.out.println(animal1.color);//null
        System.out.println(animal1.age);// 0 because by default, we have no value in the AnimalClass class

        animal1.name = "Simba";//we give value to the animal
        System.out.println(animal1.name);//return is Simba

        animal1.color = "Brown";//we assign the value now
        animal1.age = 13;//we assign the value now

        System.out.println(animal1.color);//return is Brown now
        System.out.println(animal1.age);// return is 13 now

        //create a new Object,initialize all the instance variables and print them
        System.out.println("__________________________");
        AnimalClass animal2 = new AnimalClass();

        animal2.name = "Balloo";
        animal2.color = "grey";
        animal2.age = 8;
        System.out.println(animal2.color);//grey
        System.out.println(animal2.name);//Balloo
        System.out.println(animal2.age);//8

        System.out.println(animal2.gender);//is "Female" by default
        System.out.println(animal1.gender);// is "Female" by default

        animal2.gender = "Male";//resign the value
        System.out.println(animal2.gender);// Male now

        System.out.println("++++++++++++++++++++++++++++++++++");

        animal2.eat();//Balloo is eating
        animal1.eat();// Simba is eating

        //Task:
        //create a method that will print out all proprieties of every animal

        animal1.details();//Name-Simba, color-Brown, age-13, gender-Female
        animal2.details();//Name-Balloo, color-grey, age-8, gender-Male
        System.out.println("++++++++++++++++++++++++++++++++++++++++");

        //new example

        AnimalClass dog = new AnimalClass();
        dog.name = "Bobbi";

        System.out.println(dog.energyLevel);// 0

        dog.eat();//100 energyLevel

        System.out.println(dog.energyLevel);//100 now, because "eat" method was triggered
        System.out.println("Animal2 energy is " +animal2.energyLevel );

        //create run method when an animal runs, looses 20 points of the energy
        //implement the logic and show the final energyLevel
        //include in the method the name to let the user know who is running

        animal2.run();//After running energy level of Balloo is 80
        animal2.run();//After running energy level of Balloo is 60

        animal2.eat();//Energy level is 100 after eating

        // I want to have a random number so that I can add 1000 to it in this class
        Student student = new Student();
        int number = student.hourCreator();
        System.out.println(number + 1000);//random number + 1000, because we called the hourCreator method


    }

}
