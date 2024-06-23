package recapWithAhmed;

public class StaticInstanceBlock {
    /*
    POSSIBLE INTERVIEW QUESTIONS:
         1- What is STATIC as a keyword and why do we use it?
               --> Static (as a keyword) is a way to make a method accessible "WITHOUT CREATING AN OBJECT".
               --> The Disadvantage of using Static Keyword you can "NOT OVERRIDE A METHOD".
               NOTE: You can not OVERRIDE "PRIVATE,STATIC,FINAL METHODS".

         2- What is STATIC BLOCK?
               --> It is the block that can be called ones(WILL WORK ONE TIME).
               --> It always executes FIRST.

         3- What is  STATIC VARIABLE?
               --> It makes the Variable belong to the class.
               --> It is SHARABLE(COMMON FOR ALL OBJECTS)
               --> It can be accessed by other classes without creating an Object. Just using the name of
                the class.

         4- What is Instance Block?
               --> It is a block that can be called as many times as many Objects.
     */
    public static void main(String[] args) {

        StaticExample staticExample = new StaticExample();
        staticExample.run();
        //calling the non-static method using the Object

        StaticExample.speak();
        //calling this static method using the Class name
        //System suggested

        //WHEN WE USE STATIC INSTANCE VARIABLE MENS IT IS SHAREABLE
        //SO IT WILL BE AFFECTED EVERY TIME IS TRIGGERED
        StaticExample david = new StaticExample();
        System.out.println(david.money);//10000
        david.withdraw();
        System.out.println(david.money);//9800

        StaticExample nick = new StaticExample();
        System.out.println(nick.money);//9800
        nick.withdraw();//9600
        nick.withdraw();//9400
        System.out.println(nick.money);//9400


        // 3 Objects --> Instance println 3 times
        //3 Objects --> Static println 1 time


    }

}
