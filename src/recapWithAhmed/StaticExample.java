package recapWithAhmed;

public class StaticExample {

   public  static int money = 10000;
   public  int weight = 210;

    public static void speak(){
        System.out.println("David is speaking");
    }
    public void run(){
        System.out.println("David is running");
    }
    public void withdraw(){
        money -= 200;
        System.out.println("You are spending");
    }
    //CREATING A STATIC BLOCK
    static {
        //this will execute FIRST no matter what
        //this STATIC BLOCK
        System.out.println("I am a Static Block");
    }
    //CREATING AN INSTANCE BLOCK
    //NO KEYWORD
    {
        //INSTANCE BLOCK
        //will come after Static Block
        System.out.println("I am an Instance Block");
    }



}
