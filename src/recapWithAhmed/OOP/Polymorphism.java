package recapWithAhmed.OOP;

public class Polymorphism {
    /*
    POSSIBLE INTERVIEW QUESTIONS:
          1- What is Polymorphism? (Many forms)
               --> IT IS A DIFFERENT FORM OF OBJECT.

          2- What is Dynamic and Static Polymorphism?
               --> DYNAMIC POLYMORPHISM: It is all about OVERRIDING. --> Dynamic(action)
               --> STATIC POLYMORPHISM: It is all about OVERLOADING. --> Static(stable or no action)

          3- What is the difference between Overriding and Overloading?(MOST COMMON QUESTION)

               --> OVERLOADING:1- needs to be in the SAME CLASS.
                               2- the methods can have (FINAL,STATIC,PRIVATE)
                               3- whenever you overload, it checks METHOD SIGNATURE(Different METHOD SIGNATURE)
                       METHOD SIGNATURE ==> Name of the Method + Parameter
                                           --> public void run(int speed)
                                           --> public void run(int speed, String name)


               --> OVERRIDING: 1- needs to be in a Different Class and Sub-Class(extends,implements)
                               2- you can NOT OVERRIDE FINAL, STATIC, PRIVATE METHODS.
                               3- whenever you OVERRIDE it checks not only METHOD SIGNATURE but also return
                               type. It must have the same Method Signature.

     */

    public void dismiss(int time,int minute,String nameOfTeacher){
        System.out.println("Student is leaving at " + time + minute + " with teacher " +nameOfTeacher);
    }
    public void dismiss(int hour, String nameOfTeacher){
        System.out.println("Student are leaving at " +hour + "with Teacher " + nameOfTeacher);
    }
    //public void dismiss(int date,String nameOfTeacher){}
    //you can not Overload a method with same parameters, is comparing data type not the name.

    public void dismiss(String date,String nameOfTeacher){
        System.out.println("Hello");
    }

}
