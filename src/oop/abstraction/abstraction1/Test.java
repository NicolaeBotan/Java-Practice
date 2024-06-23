package oop.abstraction.abstraction1;

import oop.abstraction.abstraction1.Alia;
import oop.abstraction.abstraction1.CampusStudent;
import oop.abstraction.abstraction1.OnlineStudent;

public class Test {
    public static void main(String[] args) {

        OnlineStudent onlineStudent = new OnlineStudent("David", 1234);
        onlineStudent.watchViaZoom();
        onlineStudent.learn();

        //Student student = new Student();
        //You can not create an Object from Abstract Class

        Alia alia = new Alia("Alia", 1111);
        System.out.println(alia.id);

        CampusStudent campusStudent = new CampusStudent("EFE", 8888);
        campusStudent.playTableTennis();
        campusStudent.learn2();
        campusStudent.sleep();


    }
}
