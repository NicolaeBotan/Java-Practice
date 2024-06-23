package mapPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Student {
    public static void main(String[] args) {

    /*
    FirstName : David
    LastName : Pena
    Age : 25
    Gender: M
    City: Chicago

    FirstName : Jeremiah
    LastName : Michaelson
    Age : 15
    Gender: M
    City: Lake Forest

    FirstName : Michael
    LastName : White
    Age : 35
    Gender: M
    City: Winnetka

    FirstName : Sarah
    LastName : Star
    Age : 29
    Gender: F
    City: Chicago

    Store students info in Maps
    Store those info in List
    From list of students, find out city of the student
    If student lives out of Chicago --> "You can join Online Class"

     */
        //Creating 4 Maps for each student
        HashMap<String, String> student1 = new HashMap<>();
        HashMap<String, String> student2 = new HashMap<>();
        HashMap<String, String> student3 = new HashMap<>();
        HashMap<String, String> student4 = new HashMap<>();
        //adding the info to the Maps
        student1.put("FirstName", "David");
        student1.put("LastName", "Pena");
        student1.put("Age", "25");
        student1.put("Gender", "M");
        student1.put("City", "Chicago");

        student2.put("FirstName", "Jeremiah");
        student2.put("LastName", "Michaelson");
        student2.put("Age", "15");
        student2.put("Gender", "M");
        student2.put("City", "Lake Forest");

        student3.put("FirstName", "Michael");
        student3.put("LastName", "White");
        student3.put("Age", "35");
        student3.put("Gender", "M");
        student3.put("City", "Winnetka");

        student4.put("FirstName", "Sarah");
        student4.put("LastName", "Star");
        student4.put("Age", "29");
        student4.put("Gender", "F");
        student4.put("City", "Chicago");

        //creating a List to store the studentInfo
        List<HashMap<String, String>> studentInfo = new ArrayList<>();

        //adding the students Map to the List
        studentInfo.add(student1);
        studentInfo.add(student2);
        studentInfo.add(student3);
        studentInfo.add(student4);

        System.out.println(studentInfo);
        //find students that are age of 30 or younger, and they are from Chicago
        //Integer.parseInt(student.get("Age")) --> this is converting a String to Integer
        for(HashMap<String, String> student : studentInfo){
            if(student.get("City").equalsIgnoreCase("Chicago")
                    && Integer.parseInt(student.get("Age")) <= 30 ){
                System.out.println(student.get("FirstName") + " is from Chicago and the age is 30 or less");
            }
        }

        //finding the city of each student
        //If student lives out of Chicago --> "You can join Online Class"
        for (HashMap<String, String> student : studentInfo) {
            if (!student.get("City").equalsIgnoreCase("Chicago")) {
                System.out.println(student.get("FirstName") + " You can join online!!!");
                //Jeremiah You can join online!!!
                //Michael You can join online!!!
            }
        }
        //solve the question using
        //for loop with index number

        for (int i = 0; i < studentInfo.size(); i++) {
            if (!studentInfo.get(i).get("City").equalsIgnoreCase("Chicago")) {
                System.out.println(studentInfo.get(i).get("FirstName") + " You Can Join Online !!!");
                //Jeremiah You Can Join Online !!!
                //Michael You Can Join Online !!!
            }
        }
        List<List<String>> result1 = nameFinder(studentInfo);//to implement the method nameFinder
        HashMap<String, List> result2 = nameFinder1(studentInfo);

        for (Object city : result2.get("City")) { //this is giving the list of the cities
            //System.out.println(list);
            if (city.toString().equalsIgnoreCase("Winnetka")) {
                //when these are matching it prints this
                System.out.println("You are lucky since you are in " + city);
                //You are lucky since you are in Winnetka
            }
        }
    }

    //create a method
    //as parameter has a List<HashMap<String,String>>
    //return students FirstNames one List and LastNames as another List
    public static List<List<String>> nameFinder(List<HashMap<String, String>> list) {

        //we create 2 Lists to store the first and last names
        List<String> firstName = new ArrayList<>();
        List<String> lastName = new ArrayList<>();
        List<List<String>> fullNames = new ArrayList<>();


        for (HashMap<String, String> student : list) {
            firstName.add(student.get("FirstName"));
            lastName.add(student.get("LastName"));
        }
        fullNames.add(firstName);
        fullNames.add(lastName);
        System.out.println(fullNames);
        return fullNames;

    }

    public static HashMap<String, List> nameFinder1(List<HashMap<String, String>> list) {

        //we create 2 Lists to store the first and last names
        //create a list for the cities
        List<String> firstName = new ArrayList<>();
        List<String> lastName = new ArrayList<>();
        List<String> city = new ArrayList<>();

        HashMap<String, List> map1 = new HashMap<>();

        //finding cities, last names,first names
        for (HashMap<String, String> student : list) {
            firstName.add(student.get("FirstName"));
            lastName.add(student.get("LastName"));
            city.add(student.get("City"));
        }
        map1.put("FirstName", firstName);
        map1.put("LastName", lastName);
        map1.put("City", city);
        System.out.println(map1);
        return map1;
    }

}
