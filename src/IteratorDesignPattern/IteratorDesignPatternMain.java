package IteratorDesignPattern;

public class IteratorDesignPatternMain {
    public static void main(String[] args) {
        Library library = new Library(5);

        library.addBook(new Book("Design Patterns"));
        library.addBook(new Book("DSA"));
        library.addBook(new Book("Java"));
//        library.addBook(new Book("Microservices"));
//        library.addBook(new Book("Python"));
//        library.addBook(new Book("Aws"));

        Iterator bookIterator = library.createIterator();

        while (bookIterator.hasNext()){
            Book book = (Book) bookIterator.next();
            System.out.println("Book : "+book.getTitle());
        }

    }
}
