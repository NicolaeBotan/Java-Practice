package object;

public class AnimalClass {
//instance variables/examples
//they define the object/belong to the Object
        String name;//no value
        String color;//no value
        int age;//no value assigned
        int energyLevel;

        String gender = "Female";//assigned
    //value ,so this is the default value for
    //the gender when we use it in the Object

public void eat ( ){
    //to be able to make the energy level 100%, when the animal eats, then we put it in the eat method
    energyLevel = 100;//in the "eat" method the energyLevel becomes 100%
    System.out.println("Energy level is "  +energyLevel + " after eating");
    System.out.println( name + " is eating");

}
public void details ( ){
    System.out.println( "Name-"+ name +", color-"+ color + ", age-"+ age +", gender-" + gender);
}
public void run ( ){
    energyLevel -= 20;
    System.out.println("After running energy level of " +name + " is " + energyLevel);

}

    }

