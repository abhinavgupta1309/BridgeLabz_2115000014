import java.util.ArrayList;
class Book {
    	private String title;
    	private String author;
    	public Book(String title, String author) {
        this.title = title;
        this.author = author;
}
    	public String getTitle() {
        return title;
}
    	public String getAuthor() {
        return author;
}
}
	class Library {
    	private String name;
    	private ArrayList<Book> books;
    	public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
}
    	public void addBook(Book book) {
        books.add(book);
}
    	public void displayBooks() {
        System.out.println("Library: " + name);
        for (Book book : books) {
        System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor());
}
}
}
	public class LibraryBooks {
    	public static void main(String[] args) {
        Book book1 = new Book("Engineers", "Abhinav Gupta");
        Book book2 = new Book("Bachelors", "Parth Goyal");
        Book book3 = new Book("Breaking Bad", "Kshitiz Katiyar");
        Library library1 = new Library("College Library");
        Library library2 = new Library("Series Library");
        library1.addBook(book1);
        library1.addBook(book2);
        library2.addBook(book2);
        library2.addBook(book3);
        library1.displayBooks();
        library2.displayBooks();
}
}
