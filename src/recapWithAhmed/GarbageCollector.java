package recapWithAhmed;

public class GarbageCollector {
    /*
    POSSIBLE INTERVIEW QUESTIONS:
          1- What is Garbage Collector and where it's coming from?
                --> It is a way to clean up  useless/unused data from the memory. Otherwise, it will  take up
                some space in your memory and will cause low memory error.
                Primitive data--> Stack Memory.
                Object type data --> Heap Memory.
             System.gc() ==> Coming from System Class.

          2- How can you PROVE that Garbage Collector is working?
                --> To be able to prove that GARBAGE COLLECTOR is working I override finalize method
                from OBJECT Class.(Object Class is the Parent od every Class)

          3- How can you make the element garbage?
               --> You can assign the value "null".
               --> You can assign the reference with another value.
                     int a=5
                     int b=3
                     b=a (3 is garbage now)
          4- Do ypu have to call your garbage collector to clean up your codes?
                --> No you don't have to call the GARBAGE COLLECTOR because it's working automatically.
     */

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public static void main(String[] args) {

        System.gc();//we can manually call the GC, but it is working automatically
        //SYSTEM.GC() CAN BE CALLED ONLY ONE TIME NOT MULTIPLE
    }

}
