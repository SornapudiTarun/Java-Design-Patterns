package IteratorDesignPattern;

public class Library implements BookCollection {
    private Book[] books;
    private int index=0;

    public Library(int size){
        books = new Book[size];
    }

    public void addBook(Book book){
        if (index< books.length){
            books[index]=book;
        }
    }
    @Override
    public Iterator createIterator() {
        return new BookIterator(books);
    }
}
