package oop.abstraction.abstraction2;

public interface CanFly {

    //FULLY ABSTRACT

    //SINCE THIS IS AN INTERFACE, AND IF YOU WANT TO HAVE INSTANCE VARIABLES YOU MUST
    //GIVE A VALUE TO THEM.
    //IN INTERFACE THE VARIABLE IS FINAL so the names should be UpperCase
    // IN INTERFACE YOU DON'T HAVE TO USE KEYWORD "FINAL"
    // THE KEYWORD FINAL IS UNNECESSARY, IT'S FINAL BY DEFAULT
    // IN THE INTERFACE ALL VARIABLES AND METHODS ARE "PUBLIC" BY DEFAULT AS AN ACCESS MODIFIER
    // IN THE INTERFACE ALL VARIABLES ARE "STATIC"
    int TAIL = 1; //public access modifier by default
    int WING = 2;//public access modifier by default


    //CREATING BEHAVIORS/FUNCTIONS/METHODS
    //ALL METHODS ARE PUBLIC AND ABSTRACT BY DEFAULT

    abstract void fly();
    void landing(double speed);
    //it is ok to define a Parameter in the Abstract methods

    //ALL METHODS AND VARIABLES ARE ,PUBLIC, STATIC AND
    //ABSTRACT

    //WE CAN ALSO CREATE A METHOD IN THE INTERFACE
    //THAT IS NOT ABSTRACT

    default void printInfo(){
        System.out.println(this.TAIL + " ---- " +this.WING);
    }
    //THE DEFAULT KEYWORD HERE IS NOT THE ACCESS MODIFIER,
    // IT'S A KEYWORD SAYING THAT IS NON-ABSTRACT METHOD
    //THE ACCESS MODIFIER IS PUBLIC BY DEFAULT







}
