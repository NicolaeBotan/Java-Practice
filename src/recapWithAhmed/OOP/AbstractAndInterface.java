package recapWithAhmed.OOP;

public class AbstractAndInterface {
    /*
    POSSIBLE INTERVIEW QUESTIONS:
         1- What is Abstract? Clarify with details.
              --> ABSTRACT IS A WAY TO ORGANIZE THE METHODS ONLY WITH NECESSARY INFORMATION(TEMPLATE).
                  YOU DO NOT HAVE  BODY IN ABSTRACT METHODS.
                  MEANS THAT PEOPLE CAN SEE THE TEMPLATES OF THE METHODS, AND "OVERRIDE" THE METHODS BASED
                  ON REQUIREMENTS.
              NOTE: We do not have a body for abstract methods because every class that extends to the
                    Abstract Class can make their own IMPLEMENTATION.

         2- Why do you need to have Abstract Class in your Project?
              --> FOR MANY METHODS, WE NEED DEVELOPERS TO MAKE THEIR OWN IMPLEMENTATION TO REDUCE THE AMOUNT
                  OF DUPLICATION IN THE PROJECT WITCH CAUSE MEMORY/SYSTEM SLOWNESS, MORE EXECUTION FOR SYSTEM.

         3- Where do you use Abstract Class in your Project?
              --> I WOULD DEFINITELY SAY THAT I USED GENERAL OOPS CONCEPT EVERYWHERE IN MY PROJECT.
                  IN AUTOMATION SCRIPT I DO NAT USE TOO MUCH BUT I KNOW MY TEAM DEVELOPERS ARE USING.

         4- Can you create an Object from Abstract Class? If no, how are you going to
         access all the methods and variables from Abstract class?
              --> YOU CAN NOT CREATE AN OBJECT FROM ABSTRACT CLASS.
              --> TO BE ABLE TO ACCESS THE METHODS AND VARIABLES IS TO OVERRIDE THEM.
                    (EXTENDS FROM PARENT TO CHILD)

         5- Can you have normal and abstract methods in Abstract Class?
            --> YES YOU CAN HAVE BOTH OF THE METHOD TYPES INSIDE  AN ABSTRACT CLASS.

    INTERFACE:

        POSSIBLE INTERVIEW QUESTIONS:
             1- What is Interface?
                  --> Interface is a BluePrint of the class which has special method that can
                      be overridden to make new implementations in Sub-Class.
                  --> We use "IMPLEMENT" keyword to make the class connected with the Interface.

             2- Why do we need Interface if we have Abstract?
                  --> Because Interface have more features in terms of accessing multiple Parents at
                      the same time by OVERRIDING.

             3- What is the difference between Interface and Abstract? (MOST COMMON QUESTION).

                  --> INTERFACE: 1- is declared with Interface keyword.
                                 2- can have only public abstract methods.(DEFAULT KEYWORDS-->EXCEPTION)
                                 3- to make a connection between classes we use "implements" keyword.
                                 4- IN INTERFACE YOU CAN IMPLEMENT AS MANY, AS MANY PARENTS YOU WANT.
                                 5- when you initialize a variable in Interface as default is "FINAL STATIC"
                                 6- Methods must be "PUBLIC ABSTRACT" by default.
                                 7- CAN NOT HAVE CONSTRUCTOR.

                  --> ABSTRACT:  1- is declared with Abstract keyword.
                                 2- may or may not have regular methods.
                                 3- to make a connection between classes we use "extends" keyword.
                                 4- YOU CAN EXTEND THE CLASS ONES.(One extends keyword in one class)
                                 5- when you declare a variable there is no default keyword.
                                 6- you can have any Access Modifier for this. (no default keyword)
                                 7- CAN HAVE CONSTRUCTOR.

     */












}
