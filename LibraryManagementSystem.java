import java.util.Scanner;

class Book {
String title;
String author;
String genre;
String bookID;
boolean isAvailable;
Book next;
Book prev;
Book(String title, String author, String genre, String bookID, boolean isAvailable) {
this.title = title;
this.author = author;
this.genre = genre;
this.bookID = bookID;
this.isAvailable = isAvailable;
this.next = null;
this.prev = null;
}
}

class Library {
Book head;
Book tail;
void addBookAtBeginning(String title, String author, String genre, String bookID, boolean isAvailable) {
Book newBook = new Book(title, author, genre, bookID, isAvailable);
if (head == null) {
head = tail = newBook;
return;
}
newBook.next = head;
head.prev = newBook;
head = newBook;
}
void addBookAtEnd(String title, String author, String genre, String bookID, boolean isAvailable) {
Book newBook = new Book(title, author, genre, bookID, isAvailable);
if (head == null) {
head = tail = newBook;
return;
}
tail.next = newBook;
newBook.prev = tail;
tail = newBook;
}
void removeBookByID(String bookID) {
if (head == null) {
return;
}
if (head.bookID.equals(bookID)) {
head = head.next;
if (head != null) {
head.prev = null;
}
return;
}
Book temp = head;
while (temp != null && !temp.bookID.equals(bookID)) {
temp = temp.next;
}
if (temp == null) {
return;
}
if (temp.next != null) {
temp.next.prev = temp.prev;
}
if (temp.prev != null) {
temp.prev.next = temp.next;
}
}
Book searchBookByTitleOrAuthor(String key) {
Book temp = head;
while (temp != null) {
if (temp.title.equals(key) || temp.author.equals(key)) {
return temp;
}
temp = temp.next;
}
return null;
}
void updateAvailabilityStatus(String bookID, boolean newStatus) {
Book temp = head;
while (temp != null) {
if (temp.bookID.equals(bookID)) {
temp.isAvailable = newStatus;
return;
}
temp = temp.next;
}
}
void displayBooksForward() {
Book temp = head;
while (temp != null) {
System.out.println(temp.title + " " + temp.author + " " + temp.genre + " " + temp.bookID + " " + temp.isAvailable);
temp = temp.next;
}
}
void displayBooksReverse() {
Book temp = tail;
while (temp != null) {
System.out.println(temp.title + " " + temp.author + " " + temp.genre + " " + temp.bookID + " " + temp.isAvailable);
temp = temp.prev;
}
}
int countBooks() {
int count = 0;
Book temp = head;
while (temp != null) {
count++;
temp = temp.next;
}
return count;
}
}

public class LibraryManagementSystem {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
Library library = new Library();
library.addBookAtBeginning("Book A", "Author X", "Tech", "B1", true);
library.addBookAtEnd("Book B", "Author Y", "Non-Tech", "B2", false);
library.displayBooksForward();
library.removeBookByID("B1");
library.displayBooksForward();
library.updateAvailabilityStatus("B2", true);
library.displayBooksForward();
System.out.println("Total Books: " + library.countBooks());
scanner.close();
}
}

