package oop.inheritance1;

public class Cat extends DomesticAnimal{

String name;

    @Override
    public void play() {
        System.out.println(name + " is paying");
    }
    void jump (){
        System.out.println("Cat is jumping");
    }
    //Commenting out private hunt method since it was
    //having wider access modifier in the parent class
    //here it is not compiling since we made it private

//    private void hunt(){
//        System.out.println("Cat is hunting");
//    }
    @Override //co-variant return type
    public Cat hunt(){
        return new Cat();
    }
}
