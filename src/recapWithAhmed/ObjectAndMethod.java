package recapWithAhmed;

public class ObjectAndMethod {
    /*
    POSSIBLE INTERVIEW QUESTIONS:
          1- What do you know about Object? Tell me couple methods of it.
              -->Always go general to deep.
              --> Object is a representation of the class.(BluePrint or DNA)
              --> There are some useful methods of Object that I use to perform some actions
              in my Project.
              --> .equals() --> Comparison of 2 Object values.
              --> .toString()--> Its a way to make the data into String format.
              --> .HashCode()--> gives you the location of the data.

          2- What is the difference between Object and class?
               --> Class: is a blueprint/template which you can create as many as you can.
               --> Object is the Representation of a class/ Instance of a Class(Instance=Object)
               -->CLASS: is declared with "class" keyword.
               -->OBJECT: is declared with "new" keyword.

          3- How do you initialize the INSTANCE VARIABLE?
               --> There are some common ways to initialize the Instance Variable.
               --> CONSTRUCTOR.
               --> METHODS (getters and setters)
               --> OBJECT
               --> DECLARE AND INITIALIZE

          4- What is the difference between local and instance variable?
               --> INSTANCE VARIABLE belongs to class. It has DEFAULT values.(null,0,0.0,false)
               --> It can have ACCESS MODIFIERS(Public,Private,Protected,DEFAULT*)

               --->LOCAL VARIABLES belong to BLOCKS.
               --->NO DEFAULT VALUE (means that you have to INITIALIZE THEM)
               --->NO ACCESS MODIFIERS

     */
    String name = "David";
    int age = 31;
    String eyeColor = "Brown";
    String nationality;

    //we will CREATE A CONSTRUCTOR
    //so in the CONSTRUCTOR WE INITIALIZE THE INSTANCE VARIABLES EVERY TIME WE CREATE A NEW CONSTRUCTOR
    public ObjectAndMethod(String name, int age, String eyeColor, String nationality) {
        this.name = name;
        this.age = age;
        this.eyeColor = eyeColor;
        this.nationality = nationality;
    }
    //METHOD WITH LOCAL VARIABLES
    public void run(int speed){
        int number = 1; //local variables must be initialized
        //public int number--> local variables CAN NOT HAVE ACCESS MODIFIERS
        //you can NOT DIRECTLY ACCESS A LOCAL VARIABLE

        System.out.println(number);
        System.out.println(speed);
    }

    public static void main(String[] args) {
        //We crete an Object from this class

        ObjectAndMethod object = new ObjectAndMethod("ALEX", 35, "BLACK",
                "Romania");//OBJECT --> representation of the class
        System.out.println(object.age);//31 by default
        object.age = 32;
        System.out.println(object.age);//32 because we reassigned the value

        System.out.println(object.nationality);//null
        object.nationality = "Moldova";
        System.out.println(object.nationality);//Moldova because we assigned the value

    }
}
