package mapPractice;

import java.util.HashMap;
import java.util.Map;

public class EmployeeTest {
    public static void main(String[] args) {
         /*
    -create an employee class with instance variables of name,city,age,id
    -create one constructor to initialize instance variables
    -create a method to generate random employee id and use this id for employee
    -crete employeeTest class
    -crete 4 employee Objects and store them in a Map
    -while storing employees in the Map use their Ids as key
    -crete a method to print only employee names from Map
     */
        Employee e1 = new Employee("Alex", "Denver", 24, 101);
        Employee e2 = new Employee("David", "LA", 26, 102);
        Employee e3 = new Employee("George", "New York", 29, 103);
        Employee e4 = new Employee("Adrian", "Columbus", 28, 104);

        Map<Integer, Employee> dataBase = new HashMap<>();//Employee datatype,where its stored all the info
        //key goes first then Employee goes second
        dataBase.put(e1.iD, e1);
        dataBase.put(e2.iD, e2);
        dataBase.put(e3.iD, e3);
        dataBase.put(e4.iD, e4);
        System.out.println(dataBase);

        //print the names using the nameFinder method
        nameFinder(dataBase);//it will print all the names

        //print the cities with the cityFinder
        cityFinder(dataBase);//it will print all cities

    }
    //print employee names
    public static void nameFinder(Map<Integer, Employee> data) {
        for (Employee employee : data.values()) {
            System.out.println(employee.name);
        }
    }
    //city finder
    public static void cityFinder(Map<Integer, Employee> data) {
        for (Employee employee : data.values()) {
            System.out.println(employee.city);
        }
    }
}
