class Book {
String title;
int publicationYear;
Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
}
void displayInfo() {
        System.out.println("Title: " + title + ", Publication Year: " + publicationYear);
}
}
class Author extends Book {
String name;
String bio;
Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
}
void displayInfo() {
        System.out.println("Title: " + title + ", Publication Year: " + publicationYear + ", Author: " + name + ", Bio: " + bio);
}
}
public class LibraryManagement {
public static void main(String[] args) {
        Author author = new Author("Learn JAVA in 24 Hours", 2025, "Bhanu Pratap Singh", "Software Developer and author.");
        author.displayInfo();
}
}
