package aModifier;

public class TestAnimal {
    public static void main(String[] args) {

        Animal animal = new Animal();

        animal.colorDefault = "White";
        animal.runProtected();
        animal.namePublic = "Jerry";
        animal.ageProtected = 4;
        //you can reach all of these Instance variables and methods if you are in the same package







    }
}
