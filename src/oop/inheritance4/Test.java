package oop.inheritance4;

public class Test {
    public static void main(String[] args) {

        Book book = new Book(200, "Java", "Coding");
        System.out.println(book.pageCount);//200

        System.out.println(book.getPageCount());//200

        //we create a new Object
        NoteBook noteBook = new NoteBook();
        System.out.println(noteBook.pageCount);//500

        //reaching the get() method from Parent class
        System.out.println(noteBook.getPageCount());


        book.pageCount = 404;
        System.out.println(noteBook.pageCount);
        System.out.println(book.pageCount);

        //calling the static read() method
        book.read();//you can reach the static method this way BUT(usingObject)
        noteBook.read();//you can reach the static method this way BUT(usingObject)
        Book.read();//YOU SHOULD USE CLASS NAME TO REACH A STATIC METHOD
        NoteBook.read();//YOU SHOULD USE CLASS NAME TO REACH A STATIC METHOD
        System.out.println("___________");

    }
}
