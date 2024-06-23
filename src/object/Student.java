package object;

import java.util.Random;

public class Student {

    int batchNumber;
    String firstName;
    String lastName;

    public void study() {
        int number = hourCreator();
        System.out.println(firstName + " is studying for " + number + " hours.");
    }

    public void sleep() {
        //int number = hourCreator(); It not necessary to store this, you can directly use it in sout
        System.out.println(firstName + " sleeps for " + hourCreator() + " hours.");
    }

    public int hourCreator() {
        Random random = new Random();
        int hour = random.nextInt(12);
        return hour;
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.study();
        student.firstName = "Alex";
        student.study();
        student.sleep();



    }
}
