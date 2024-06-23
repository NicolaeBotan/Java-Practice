package oop.abstraction.abstraction1;

public class OnlineStudent extends Student {
    //This is also the First Level Child of the Parent Student class
    //So we must implement The Abstract Methods here for the first time
    public OnlineStudent(String name, int id){
        super("Tim",1234);
    }
    public void study(){
        System.out.println("Online student is studying");
    }
    public void learn(){
        System.out.println("Online is learning");
    }
    public int learn2(){
        System.out.println("Is learning");
        return 3;
    }
    public int watchViaZoom(){
        System.out.println("Attending via Zoom");
        return 4;
    }

}
