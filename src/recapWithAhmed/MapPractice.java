package recapWithAhmed;

public class MapPractice {
    /*
    POSSIBLE INTERVIEW QUESTIONS:
         1- Can you tell me about Map and why do you use it in your Project?
            --> Map is an awesome Interface to be used in my Project to share/store my data as
            "KEY" and "VALUE".

         2- What is the connection between Collection and Map?
            --> They are all useful. I use them in my Project for different purposes.
            --> As I mentioned before: *-SET is all about uniqueness.
                                       *-LIST is all about duplication if there is need.
                                       *-MAP is all about KEY and VALUE.

                When I was working on Map, I checked the feature of KEY and feature of VALUE.
                -->KEY acts like Set Feature, so it means it only accepts the unique data.
                -->VALUE acts like List Feature, so it will accept duplicates as well.

         3- What is the type of Map and difference between them?
             --> To be honest I didn't like the Map at the beginning because it seemed so complicated,
             but after I learned the beauty of Sub-types that are 3 of them:
                     ---HashMap --> it stores randomly.
                     ---LinkedHashMap --> it stores Insertion
                     ---TreeMap --> is my favorite to use, is in Ascending Order.

         4- Synchronization? Can you give examples and what do you know about it usage in Java?
            --> FIRST COME, FIRST SERVED.
  *** IT EXECUTES ANY ACTIONS ONE BY ONE.
            --> We have 2 most common concepts in Java use Synchronization.
                -->HASHTABLE
                -->STRING BUFFER
     ==> SYNCHRONIZED SYSTEM IS "THREAD-SAFE" AND IT IS SLOWER.

     ==> NON SYNCHRONIZED SYSTEM is "NOT THREAD-SAFE" so it is FASTER.
                (LIST,MAP,SET,STRING BUILDER)

     */
    public synchronized void run() {
        System.out.println("Hello");
    }//This method because is synchronized will run ,

    // be done and then continue with others
    public void run2() {
        System.out.println("Hi");
    }//it's not going to wait for anything it will just run

}
