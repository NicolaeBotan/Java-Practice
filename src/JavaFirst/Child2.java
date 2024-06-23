package JavaFirst;

import aModifier.Animal;

public class Child2 extends Animal {
    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.namePublic = "Jerry";
        animal.eatPublic();

        Child2 child2 = new Child2();
        child2.ageProtected = 5;
        child2.namePublic = "Jr Jerry2";

        child2.eatPublic();//it will trigger the private weight variable only because
        //it is inside the public eat() method


    }
}
