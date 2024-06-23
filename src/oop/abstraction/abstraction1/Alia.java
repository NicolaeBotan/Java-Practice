package oop.abstraction.abstraction1;

public class Alia extends OnlineStudent {

    public Alia(String name, int id){
        super("OnlineStudent",11111);

    }

    @Override
    public void study() {
        System.out.println("Alia Studies");
    }

    @Override
    public void learn() {
        System.out.println("Learning");
    }

    @Override
    public int learn2() {
        return 4;
    }

    @Override
    public int watchViaZoom() {
        return 5;
    }

    @Override
    public void sleep() {
        System.out.println("Alia Sleeps");
    }
}
