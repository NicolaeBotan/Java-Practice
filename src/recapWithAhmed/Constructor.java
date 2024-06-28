package recapWithAhmed;

public class Constructor {
    /*
    POSSIBLE INTERVIEW QUESTIONS:
    IMPORTANT:
         ==>CONSTRUCTOR CAN BE OVERLOADED.(OVERLOADING HAPPENS IN THE SAME CLASS)
         ==>YOU CAN NOT OVERWRITE THE CONSTRUCTOR.
        1- What is Constructor and what do you do with it?
              -->It is a Way to INITIALIZE AN INSTANCE VARIABLE.
              -->IT is a way to assign value for Object Features.

        2- Tell me the Difference between Constructor and Method?
             --->CONSTRUCTOR: No RETURN TYPE.
                              MUST HAVE SAME NAME OF CLASS.
             --->METHOD: IT MUST HAVE RETURN TYPE.
                         IT may or may not have the same name as the class name.

        3- Can you make Constructor Static , Final and private?
             -->UI have SINGLETON PATTERN DESIGN. We use PRIVATE CONSTRUCTOR TO PREVENT OTHER CLASSES
               TO ACCESS THE DRIVER.
             --> You can not make the Constructor static,final or private (EXCEPTION - SINGLETON PATTERN DESIGN)

        4- What is the difference between this,this(),super,super()?
               --> this. is a keyword which refers to instance variables or methods of class.
               --> this(). refers to the CONSTRUCTOR of the same Class.
               --> super. is a keyword which refers to parent instance variables or methods of class.
               --> super(). refers to the Parent Constructor from Different Class.
     */

    String brand = "Porsche";
    int wheel = 4;
    int door = 2;

    // creating a Constructor with a parameter
    //any time you create a Constructor , the DEFAULT CONSTRUCTOR IS GONE
    //DEFAULT CONSTRUCTOR LOOKS LIKE THIS --->   public className (){}
    public Constructor(String brand) {
        this.brand = brand;
    }

    public Constructor(int door) {
        this.door = door;
    }

    //OVERLOADING THE CONSTRUCTOR...GIVING MORE PARAMETERS
    public Constructor(String brand, int wheel) {
        //when you use this() calling a different constructor in this constructor should be on the first line
        this(4);//we CALLED THE DOOR CONSTRUCTOR IN THIS CONSTRUCTOR
        //EVERY TIME WE CALL THIS CONSTRUCTOR IN OTHER CLASSES IT WILL ASSIGN 4 ALWAYS TO THE DOOR INSTANCE
        this.brand = brand;
        this.wheel = wheel;

    }

    public static void main(String[] args) {
        Constructor porsche314 = new Constructor("Porsche 911");//we initialized the instance variable
        System.out.println(porsche314.brand);//Porsche 911
        Constructor example = new Constructor("BMW", 3);
        System.out.println(example.door);//4 BECAUSE WE CREATED THE CONSTRUCTOR THAT INSIDE HAS OTHER CONSTRUCTOR
        //THAT INITIALIZE THE DOOR VARIABLE WITH THE 4 VALUE. MEANING THE OTHER CONSTRUCTOR IS RUNNING ALSO.
        System.out.println(example.wheel);//3

    }

}
