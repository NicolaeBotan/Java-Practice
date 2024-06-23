package recapWithAhmed.OOP;

public abstract class AbstractPractice1 {
    //ABSTRACT MEANS GHOST CLASS
    //THE TEMPLATE

    public static String name;

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        AbstractPractice1.name = name;
    }

    public  void run(){//you can have regular method
        System.out.println("I am running");
    }
    public abstract void dismiss();
    //Abstract method ,only template,no implementation, doesn't have body

    public abstract void speak();
    //Abstract method ,only template,no implementation, doesn't have body

    //IN ABSTRACT CLASS YOU CAN CRETE CONSTRUCTOR
    public AbstractPractice1(){}
}

