package stringBuilder;

public class Practice4 {
    //create a method that will take a StringBuilder Object
    //this method will delete ** from given parameter
    //"t*he i*nte*rvie*w *i*s *com*ing*"
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("t********he ********i*nte****rvie*w *i*s *com*ing*");
        deleteStars(builder);
        System.out.println(builder);//the interview is coming


    StringBuilder[] array = {new StringBuilder("icodie"), new StringBuilder("fish"),
            new StringBuilder("iinterview"), new StringBuilder("isii"), new StringBuilder("coming")};

    replaceIs(array);

}

    static public void deleteStars(StringBuilder builder) {
        for (int i = 0; i < builder.length(); i++) {
            if (builder.charAt(i) == '*') {
                builder.deleteCharAt(i);
                i--;//we implement this for the i to go back and check again for stars
                //because the index number will increase in the for loop
            }
        }

    }
    //{"code","fish","interview","mock","is","coming","soon"}
    //replace every char 'i' with '-' from given StringBuilder array os Strings
    //solve by creating a method and pass the array as a parameter

    public static void replaceIs(StringBuilder[] builder) {
        for (StringBuilder items : builder) {
            for (int i = 0; i < items.length(); i++) {
                if (items.charAt(i) == 'i') {
                    items.replace(i, i + 1, "-");

                    //another solution
                    //items.replace(items.indexOf(""+items.charAt(i)),
                            //items.indexOf(""+items.charAt(i)) + 1,"-");
                }
            }
            System.out.println(items);
        }

    }


}
