package primitives;

public class ComparisonOperators2 {
    public static void main(String[] args) {
        // there is an event, a person is 18 years old or older they can attend the event
        int ageOfPerson = 20;
        int requiredAge = 18;
        boolean canAttend = ageOfPerson >= requiredAge;
        System.out.println(canAttend);//true person can attend

        boolean canAttend1 = requiredAge <= ageOfPerson;//true because is the same thing
        System.out.println(canAttend1);
//kids, if the age of child is 12 or less,the child can attend
        int ageOfChild = 11;
        int requiredAge2 = 12;
        boolean canAttend2 = ageOfChild <= requiredAge2;
        System.out.println(canAttend2);//true because his age is 10 smaller than required age

        // if the age is 10 they can not attend

        int kidAge = 10, requiredAge3 = 10;
        boolean canNotAttendKid = kidAge == requiredAge3; //true
        System.out.println("This kid can not attend when the age is 10 " + canNotAttendKid);
        System.out.println(kidAge != requiredAge3); //false










    }
}
