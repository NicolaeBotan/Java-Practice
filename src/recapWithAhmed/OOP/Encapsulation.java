package recapWithAhmed.OOP;

public class Encapsulation {
    /*
    POSSIBLE INTERVIEW QUESTIONS:
          1- What is Encapsulation? Why do we use it?
               --> Encapsulation is a way to protect/hide/restrict(limit) data from other users/classes.
               --> We use "PRIVATE" keyword to make the data Encapsulated.
               --> It is a way to make your data not accessible and manipulable by anyone.
               --> It is a way to restrict the data from users/classes.
               --> It is a way to limit the users access to the class data.
               --> It is a way to protect the data from users/classes.

          2- How do we access the data from Encapsulation?
               --> To be able to access the data that is private, we use GETTER and SETTER methods.
               --> get() and set()
               Set() -- ASSIGN DATA
               Get() -- PRINTOUT DATA

          3- If Encapsulation is hiding the data from other classes and with getters and setters
          you can still access the data, what is the point of using Encapsulation?
               --> ACTUALLY YO CAN ACCESS THE DATA IN OTHER CLASSES WITH GETTER AND SETTER.
               --> BUT THEY CAN NOT ACCESS THE IMPLEMENTATION INSIDE THE METHOD, SO IT MEANS YOU
               ARE STILL PROTECTING YOUR DATA BASED ON YOUR CONDITION INSIDE THE METHOD.
               YOU ARE LIMITING THE DATA THAT CAN BE USED OR ENTERED/INPUTTED.

               --> IF YOU WANT ME TO GIVE YOU AN EXAMPLE, I CAN SAY I HAVE A BOOK. THE BOOK HAS 300
               PAGES. I WOULD LIKE TO ACCESS THE SPECIFIC PAGE OF THE BOOK, IF I WANT TO ACCESS A PAGE
               THAT IS MORE THAN 300 AND SMALLER THAN 0, THIS IMPLEMENTATION SHOULD GIVE ME AN ERROR AND,
               SAY THAT THE PAGE IS NOT FOUND. IT MEANS I MANIPULATE/BREAK THEIR CODE. ENCAPSULATION
               IS USED TO LIMIT THE USERS/CLASSES TO ACCESS/HIDE/PROTECT THE DATA WITH A SPECIFIC CONDITION.

               --> YOU CAN STILL ACCESS THE ENCAPSULATED/PRIVATE DATA WITH GETTER AND SETTER, BUT YOU
               CAN NOT ACCESS INSIDE THE CODE/METHOD/IMPLEMENTATION WITCH LIMITS THE USER.

     */
    public static void main(String[] args) {
        EncapsulationPractice helper = new EncapsulationPractice();
        helper.setCreditCard(55559885);
        System.out.println(helper.getCreditCard());

        helper.setName("Gim");
        System.out.println(helper.getName());

    }
}
