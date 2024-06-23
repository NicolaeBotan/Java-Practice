package recapWithAhmed;

public class StringBuilderPractice {
    /*
    POSSIBLE INTERVIEW QUESTIONS:
         1- What is the difference between String and StringBuilder?
               --> They are both useful for my Project in terms of Mutability and Immutability.
               --> String is Immutable.
               --> StringBuilder is Mutable.
               --> StringBuilder has some different methods. (append,reverse...)

         2- What is the Difference Between StringBuilder and String Buffer?
               --> StringBuffer and HashTable are both Synchronized.
               --> Map,List,Set,String,StringBuilder are NOT SYNCHRONIZED.

            NOTE 1: MUTABLE -- is all about the giving functions/actions/manipulation WITHOUT "REASSIGNING"
                  the value.
            NOTE 2: IMMUTABLE -- is all about the giving functions/actions/manipulations WITH "REASSIGNING"
                  the value.
            NOTE 3: PassByValue and PassByReference
                  --> it is all about the way you pass the data.

                  -->if you call the method and pass the value/initialize directly
                     (StringBuilderRecap.run("DAVID");--> means you are passing the value. PassByValue.)
                  --> if you call the method and pass the value with a reference
                      (String name = "DAVID";  StringBuilderRecap.run(name); PassByReference  )

     */
    public static void main(String[] args) {


        //IMMUTABLE we have to reassign the value
        String name = "David";
        name = name.replace("v", "*").concat("Loves").concat("Java ").trim();

        System.out.println(name);//Da*idLovesJava

        //MUTABLE we are not reassigning the value
        StringBuilder builder = new StringBuilder("David");
        builder.replace(2, 3, "*").append("Loves").append("Java ").trimToSize();

        System.out.println(builder);//Da*idLovesJava

        //To convert a String we can convert into StringBuilder and use reverse()
        StringBuilder builder1 = new StringBuilder(name);
        System.out.println(builder1.reverse());//avaJsevoLdi*aD
        System.out.println("======");
        System.out.println(builder1);//avaJsevoLdi*aD
        //OR
        String reverse = builder1.reverse().toString();
        System.out.println(reverse);//Da*idLovesJava

        reverse = builder1.reverse().toString();
        System.out.println(reverse);//avaJsevoLdi*aD

    }
}
