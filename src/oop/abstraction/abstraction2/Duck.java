package oop.abstraction.abstraction2;

public class Duck extends Animal implements CanFly,CanSwim {
    //WE CAN EXTEND FROM A REGULAR ANIMAL CLASS THE DUCK CLASS
    //HERE WE ARE CONNECTING DUCK CLASS TO TWO PARENTS INTERFACES
    // CAN FLY AND CAN SWIM
    //TO MAKE THE DUCK CLASS WORK, WE HAVE TO IMPLEMENTS ALL
    //METHODS FROM BOTH PARENT INTERFACES

    public void fly(){
        System.out.println("Duck is in the Air");
    }
    public void landing(double speed){
        System.out.println("Duck is coming down");
    }
    public Integer swim(int deep){
        System.out.println("Duck is swimming");
        return deep;
    }





}
