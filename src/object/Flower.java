package object;

import org.w3c.dom.ls.LSOutput;

public class Flower {
    //instance variables
    String type;
    double price;
    String color;

    //methods

    public void sell(){
        System.out.println("Selling a flower");
    }
    //now we are creating different types of Constructors
    //ANYTHING IS INSIDE THE CONSTRUCTOR , ANY CODE WILL BE TRIGGERED WHEN YOU CREATE AN OBJECT USING
    //THIS CONSTRUCTOR
    public Flower(){
        System.out.println("No Argument Constructor");
    }
    public Flower(String type){
        this.type = type; //using this constructor we initialize the variable "type" at the top
        //'this' keyword helps to assign the value to the instance variable
        System.out.println("One Argument Constructor");
    }
    // creating 2 Argument Constructor
    public Flower(String type, String color){
        this.type = type;
        this.color = color;
        System.out.println("Two Argument Constructor");
    }


}
