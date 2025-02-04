class Book {
    	private static String libraryName = "Central Library";
    	private final String isbn;
    	private String title;
    	private String author;
    	public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
}
    	public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
}
    	public void displayBookDetails() {
        if (this instanceof Book) {
        System.out.println("Library: " + libraryName);
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("ISBN: " + this.isbn);
}else {
        System.out.println("Invalid book instance.");
}
}
    	public static void main(String[] args) {
        Book book1 = new Book("The Great Indian Kapil Show", "Kapil Sharma", "9780743273565");
        Book book2 = new Book("2024", "Abhinav Gupta", "9780451524935");
        displayLibraryName();
        System.out.println();
        book1.displayBookDetails();
        System.out.println();
        book2.displayBookDetails();
    }
}

