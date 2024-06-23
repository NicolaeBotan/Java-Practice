package oop.abstraction.abstraction2;

public class Dolphin implements CanSwim{

    public Integer swim(int deep){
        System.out.println("Dolphin swims this deep " + deep + " miles");
        return deep;
        //IMPLEMENTING THE ABSTRACT SWIM METHOD FROM CAN SWIM INTERFACE
    }
}
