package Practice;

public class Practice6 {
    public static void main(String[] args) {
        String school = "techtorial";
        int lenght = school.length();
        System.out.println(lenght);
        //indexing starts from 0
        //counting starts from 1
        char ch = school.charAt(3);
        System.out.println(ch);
        int index1 = school.indexOf("t",3);// it will find the second "t" starting with index 3
        System.out.println(index1);
        int index2 = school.indexOf("tor");//it will give me the index number of t that is 4
        System.out.println(index2);//4

        school = school.concat(" academy");//"techtorial" + " academy"// we reassigned the String here
        // String is immutable,so if you want to change the value of it you have to
        // reassign or create a new String
        System.out.println(school);// result is "techtorial academy"



    }
}
