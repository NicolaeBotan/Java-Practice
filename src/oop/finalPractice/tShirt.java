package oop.finalPractice;

public final class tShirt extends Shirt{

    public tShirt(String color, String size){
        //super("brown","medium");initializing the values or
        super(color,size); //leave as a parameter
    }
    public tShirt(){
        this("white","small");
    }

    public void sale (){
        System.out.println("T-shirt sale");
    }
    //FINAL METHOD FROM PARENT CAN NOT BE OVERRIDDEN
//    public void dye(){
//        System.out.println("*********");
//    }
    public static void main(String[] args) {



        Shirt shirt = new Shirt();
        shirt.dye(); // it's using the method, but it can not be OVERRIDDEN

        //calling the Overloaded dye() method
        shirt.dye("white");//Color change of Shirt to white

        //IMPLEMENTING THE GARBAGE COLLECTOR

        Shirt shirt1 = new Shirt();
        Shirt shirt2 = new Shirt();
        Shirt shirt3 = new Shirt();

        shirt1 = null;//*******
        shirt2 = null;//******* meaning the garbage collector worked

        System.gc();




    }
}
