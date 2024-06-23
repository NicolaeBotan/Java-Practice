package oop.abstraction.abstraction2;

public class Bird implements CanFly{
    // WHEN WE HAVE A CHILD CLASS FROM INTERFACE (FULLY ABSTRACT) WE USE "IMPLEMENTS" KEYWORD
    //because in the regular class the default AccessModifier is DEFAULT,
    // we have to put Public. Access Modifier should be same level or more in the child class
   public void fly(){
        System.out.println("Bird is in the air");
    }//we are implementing the abstract methods from CanFly Interface

    public void landing(double speed){
        System.out.println("Bird is landing with the speed of " + speed);
    }//we are implementing the abstract methods from CanFly Interface

    //create a new method for the Bird Class
    protected void eat(){
        System.out.println("Bird eats");
    }




}
