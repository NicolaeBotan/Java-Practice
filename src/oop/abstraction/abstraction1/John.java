package oop.abstraction.abstraction1;

public class John extends SelfLearner {
    public John(String name, int id) {
        super(name, id);
    }
    //WE HAVE TO IMPLEMENT ALL THE ABSTRACT METHODS FROM PARENT CLASS
    //This class is the first Non-Abstract class, so it's called CONCRETE CLASS

    @Override
    public void watchVideo(){
        System.out.println("John is on YouTube");
    }
    @Override
    public void study() {
        System.out.println("John is Studying");
    }
    @Override
    public void learn() {
        System.out.println("John is learning");
    }
    @Override
    public int learn2() {
        System.out.println("Learning John");
        return 0;
    }
}
