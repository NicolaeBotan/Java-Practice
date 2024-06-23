package recapWithAhmed.OOP;

public interface InterfacePractice2 {

    //WITH DEFAULT KEYWORD YOU CAN CREATE A REGULAR METHOD IN INTERFACE
    default void run(){
        System.out.println("Hello I am from Interface");
    }

    public abstract void dismiss();
    //IN INTERFACE "public and abstract" are coming by default so there is no need
    // to put them

    void speakWithAhmet();//speak method



}
