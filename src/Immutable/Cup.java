package Immutable;

public class Cup {

    private int size;
    private String color;

    private void keepWarm(){
        System.out.println("******");
    }
    public int getSize(){
        return size; //this method being public it will give me access to see the size in
        // a different class even if its private
    }

    public static void main(String[] args) {
        Cup c = new Cup();
        c.keepWarm();
    }
}
