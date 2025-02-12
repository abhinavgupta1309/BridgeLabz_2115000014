import java.util.Scanner;
class Movie {
String title;
String director;
int year;
double rating;
Movie next;
Movie prev;
Movie(String title, String director, int year, double rating) {
this.title = title;
this.director = director;
this.year = year;
this.rating = rating;
this.next = null;
this.prev = null;
}
}

class MovieLinkedList {
Movie head;
Movie tail;
void addMovieAtBeginning(String title, String director, int year, double rating) {
Movie newMovie = new Movie(title, director, year, rating);
if (head == null) {
head = tail = newMovie;
return;
}
newMovie.next = head;
head.prev = newMovie;
head = newMovie;
}
void addMovieAtEnd(String title, String director, int year, double rating) {
Movie newMovie = new Movie(title, director, year, rating);
if (tail == null) {
head = tail = newMovie;
return;
}
tail.next = newMovie;
newMovie.prev = tail;
tail = newMovie;
}
void addMovieAtPosition(String title, String director, int year, double rating, int position) {
Movie newMovie = new Movie(title, director, year, rating);
if (position == 1) {
addMovieAtBeginning(title, director, year, rating);
return;
}
Movie temp = head;
for (int i = 1; temp != null && i < position - 1; i++) {
temp = temp.next;
}
if (temp == null || temp.next == null) {
addMovieAtEnd(title, director, year, rating);
return;
}
newMovie.next = temp.next;
newMovie.prev = temp;
temp.next.prev = newMovie;
temp.next = newMovie;
}
void removeMovieByTitle(String title) {
Movie temp = head;
while (temp != null && !temp.title.equals(title)) {
temp = temp.next;
}
if (temp == null) {
return;
}
if (temp == head) {
head = head.next;
if (head != null) {
head.prev = null;
}
} else if (temp == tail) {
tail = tail.prev;
if (tail != null) {
tail.next = null;
}
} else {
temp.prev.next = temp.next;
temp.next.prev = temp.prev;
}
}
Movie searchMovieByDirectorOrRating(String director, double rating) {
Movie temp = head;
while (temp != null) {
if (temp.director.equals(director) || temp.rating == rating) {
return temp;
}
temp = temp.next;
}
return null;
}
void updateMovieRating(String title, double newRating) {
Movie temp = head;
while (temp != null) {
if (temp.title.equals(title)) {
temp.rating = newRating;
return;
}
temp = temp.next;
}
}
void displayMoviesForward() {
Movie temp = head;
while (temp != null) {
System.out.println(temp.title + " " + temp.director + " " + temp.year + " " + temp.rating);
temp = temp.next;
}
}
void displayMoviesReverse() {
Movie temp = tail;
while (temp != null) {
System.out.println(temp.title + " " + temp.director + " " + temp.year + " " + temp.rating);
temp = temp.prev;
}
}
}
public class MovieManagementSystem {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
MovieLinkedList list = new MovieLinkedList();
list.addMovieAtBeginning("Inception", "Nolan", 2010, 8.8);
list.addMovieAtEnd("Interstellar", "Nolan", 2014, 8.6);
list.addMovieAtPosition("Avatar", "Cameron", 2009, 7.9, 2);
list.displayMoviesForward();
list.removeMovieByTitle("Interstellar");
list.displayMoviesForward();
list.updateMovieRating("Inception", 9.0);
list.displayMoviesForward();
list.displayMoviesReverse();
scanner.close();
}
}

