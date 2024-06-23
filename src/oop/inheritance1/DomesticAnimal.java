package oop.inheritance1;

public class DomesticAnimal extends Animal{

boolean hasToy;
protected void play(){
    System.out.println(name + " is playing");
}

void jump(){
    System.out.println("D is jumping");
}
public DomesticAnimal hunt(){
    System.out.println("D is hunting");
    return  new DomesticAnimal();
}

}
