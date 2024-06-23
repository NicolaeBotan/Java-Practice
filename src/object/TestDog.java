package object;

public class TestDog {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.play();//"Dog is playing"

        Dog.bath(); // "Getting clean"
        // this is how you can reach a static method from Dog class. You don't need the object
        //for importing the static method from another class.
        dog.bath();// works as well but it's not recommended




    }
}
