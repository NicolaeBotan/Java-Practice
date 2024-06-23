package recapWithAhmed.OOP;

public class InheritancePractice {
    /*
    POSSIBLE INTERVIEW QUESTIONS:
        1- What do you know about Inheritance? How do you Inherit classes?
             --> Inheritance is a way to make a connection/relation between classes.
             --> We need to use "EXTENDS" keyword to make the connection.

        2- Why do you use Inheritance in your Project?
             --> We need Inheritance because we would like to have less amount of code.
             --> REDUCE THE AMOUNT OF EXECUTION ,SAVE TIME, SAVE MEMORY,SAVE MONEY.
             --> IT WILL BE SAFER AND MORE EFFICIENT TO MAINTAIN.
             --> IT WILL LOOK MORE PROFESSIONAL.
     */
    public static void main(String[] args) {
        Porsche porsche = new Porsche();
        porsche.price = 300000;
        System.out.println(porsche.price);//300000.0
        System.out.println(porsche.tires);//4

        BMW bmw = new BMW();
        bmw.price = 500000;
        System.out.println(bmw.price);//500000.0
        System.out.println(bmw.tires);//4
    }
}
