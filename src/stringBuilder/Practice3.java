package stringBuilder;

public class Practice3 {
    public static void main(String[] args) {

        StringBuilder success = new StringBuilder("Tech");

        System.out.println(success.length());//4 letters

        success.append("nology");
        System.out.println(success.substring(5));//ology //will bring back from index 5 including 5
        // So the Substring method returns String, this means it is one of the methods that is not assigning
        //back, so the StringBuilder remains the same unless you reassign the value
        System.out.println(success);//Technology

        String str = success.substring(5);//will work because this substring returns a String
        //
        // StringBuilder bl1 = success.substring(5);//will not work because the return is String
        StringBuilder bl2 = new StringBuilder(success.substring(5));
        System.out.println(bl2); //ology this will work

        System.out.println(bl2.equals(str));//false --> one is String , one is StringBuilder
        System.out.println(str.equals(bl2));//false --> one is String , one is StringBuilder

        str.concat(" is not a word");
        System.out.println(str);//ology--> because we did not reassign, and String is immutable
        bl2.append(" is not a word");
        System.out.println(bl2);//"ology is not a word", StringBuilder is mutable,not necessary to reassign

        str = str.concat(" is not a word");//we reassigned the value of str
        System.out.println(str);//"ology is not a word"


        //we will use the insert() method
        //you give the location as index and then the value

        success.insert(5, "TRUE");//returns StringBuilder Object
        System.out.println(success);//TechnTRUEology

        success.insert(4, true);//as boolean
        System.out.println(success);//TechtruenTRUEology

        //METHODS
        //delete()
        //deleteCharAt()

        //TechtruenTRUEology -- delete the "true"
        success.delete(4, 8);
        System.out.println(success);

        //delete the "TRUE" //TechnTRUEology
        //success.delete(5,9);
        //System.out.println(success);//Technology

        //same method when you don't know the index number
        success.delete(success.indexOf("T", 1), success.indexOf("E") + 1);//+ 1 is for including the E
        System.out.println(success);//Technology

        success.insert(5, "TRUE");
        //another method

        success.delete(success.lastIndexOf("T"), success.indexOf("E") + 1);//this lastIndexOf will go from
        //the end  and find the first "T" and start deleting from that T to the only E that we have
        System.out.println(success);//Technology

        //deleteCharAt()
        success.deleteCharAt(1);
        System.out.println(success);//Tchnology


    }
}
