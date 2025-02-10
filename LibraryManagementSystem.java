import java.util.*;
abstract class LibraryItem {
private String itemId;
private String title;
private String author;
public LibraryItem(String itemId, String title, String author) {
this.itemId = itemId;
this.title = title;
this.author = author;
}
public String getItemId() {
return itemId;
}
public String getTitle() {
return title;
}
public String getAuthor() {
return author;
}
public String getItemDetails() {
return "ID: " + itemId + ", Title: " + title + ", Author: " + author;
}
public abstract int getLoanDuration();
}
interface Reservable {
void reserveItem();
boolean checkAvailability();
}
class Book extends LibraryItem implements Reservable {
private static final int LOAN_DURATION = 14;
private boolean isAvailable = true;

public Book(String itemId, String title, String author) {
super(itemId, title, author);
}

@Override
public int getLoanDuration() {
return LOAN_DURATION;
}

@Override
public void reserveItem() {
isAvailable = false;
System.out.println("Book reserved: " + getTitle());
}

@Override
public boolean checkAvailability() {
return isAvailable;
}
}

class Magazine extends LibraryItem {
private static final int LOAN_DURATION = 7;

public Magazine(String itemId, String title, String author) {
super(itemId, title, author);
}

@Override
public int getLoanDuration() {
return LOAN_DURATION;
}
}

class DVD extends LibraryItem implements Reservable {
private static final int LOAN_DURATION = 5;
private boolean isAvailable = true;

public DVD(String itemId, String title, String author) {
super(itemId, title, author);
}

@Override
public int getLoanDuration() {
return LOAN_DURATION;
}

@Override
public void reserveItem() {
isAvailable = false;
System.out.println("DVD reserved: " + getTitle());
}

@Override
public boolean checkAvailability() {
return isAvailable;
}
}

public class LibraryManagementSystem {
public static void main(String[] args) {
List<LibraryItem> items = new ArrayList<>();

Book book = new Book("B123", "Java Programming", "Code with Harry");
Magazine magazine = new Magazine("B456", "Breaking Bad", "Walter White");
DVD dvd = new DVD("D789", "Inception", "Christopher Nolan");

items.add(book);
items.add(magazine);
items.add(dvd);

for (LibraryItem item : items) {
System.out.println(item.getItemDetails());
System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

if (item instanceof Reservable) {
Reservable reservable = (Reservable) item;
System.out.println("Available: " + reservable.checkAvailability());
reservable.reserveItem();
System.out.println("Available after reservation: " + reservable.checkAvailability());
}
System.out.println("--------------------------");
}
}
}

