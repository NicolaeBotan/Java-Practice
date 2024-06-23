package oop.abstraction.abstraction1;

public abstract class SelfLearner extends Student {

    public SelfLearner(String name, int id) {
        super(name, id);
    }

    public void study() {
        System.out.println("SelfLearner study");
    }

    //creating a new method for this class
    public String visitLibrary() {
        System.out.println("SelfLearner goes to the Library");
        return "....";
    }

    public abstract  void watchVideo();
    //new abstract method in this new class
    //as well with no implementation
}
