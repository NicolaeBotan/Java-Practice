package oop.abstraction.abstraction1;

public class CampusStudent extends Student {
     //CONCRETE Class (First Level child from Parent Abstract Class )
    //CONCRETE Class must implement all abstract methods from Parent Class.
    //when we extend and Abstract class, and we have an abstract method inside
    //the Parent class with no implementation, we must implement it in the child class

    public CampusStudent(String name, int id){
        super(name, id);
    }

    @Override
    public void study() {
        System.out.println("Studying in the Campus");
    } //First time Implemented in the Child class, Abstract Method with no implementation
    // in the Parent class


    //non-Abstract class can NOT HAVE AN ABSTRACT METHOD
    //public abstract void drink ();

    @Override
    public void sleep(){
        System.out.println("Campus Student is sleeping for 5 hours");
    }
    public void learn(){
        System.out.println("Campus Student is learning");
    }//this method must be implemented in the child class because it's an abstract method in the
    //Parent class

    public int learn2(){
        System.out.println("Campus Student studies");
        return 3;
    } //first implementation of learn2() method from Parent class with int return Class

    //new functionality/method for child class
    public void playTableTennis(){
        System.out.println("Table Tennis");
    }
}
