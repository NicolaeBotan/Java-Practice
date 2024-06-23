package mapPractice;

import java.util.Map;

public class Employee {
    /*
    -create an employee class with instance variables of name,city,age,id
    -create one constructor to initialize instance variables
    -create a method to generate random employee id and use this id for employee
    -crete employeeTest class
    -crete 4 employee Objects and store them in a Map
    -while storing employees in the Map use their Ids as key
    -crete a method to print only employee names from Map
     */
    String name;
    String city;
    Integer age;
    Integer iD;

    public Employee(String name, String city, Integer age, Integer iD) {
        this.name = name;
        this.city = city;
        this.age = age;
        this.iD = iD;
    }

    //to show the details in the other class.So it will not show the hash code.
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", age=" + age +
                '}';
    }
}
