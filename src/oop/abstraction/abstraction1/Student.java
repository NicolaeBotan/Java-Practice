package oop.abstraction.abstraction1;

public abstract class Student {
    //Abstract Class

    String name;//access modifier is default
    int id;//access modifier is default


    public Student(String name, int id){
        this.id = id;
        this.name = name;
    }

    public abstract void study();
    //we created an Abstract Method that has no block/implementation
    //this method can be used in the extended classes so than the method can be implemented

    public void sleep(){
        System.out.println("Students are sleeping");
    } //Abstract Class can have a non-abstract method

    public abstract void learn();
    //test method is Abstract.
    //Abstract method can not be private
    //Abstract method can not be final
    //Abstract method can not be static

    public abstract int learn2();
}
