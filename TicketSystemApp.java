import java.util.Scanner;

class Ticket {
String ticketID, customerName, movieName, seatNumber, bookingTime;
Ticket next;
Ticket(String ticketID, String customerName, String movieName, String seatNumber, String bookingTime) {
this.ticketID = ticketID;
this.customerName = customerName;
this.movieName = movieName;
this.seatNumber = seatNumber;
this.bookingTime = bookingTime;
this.next = null;
}
}

class TicketReservationSystem {
Ticket head = null;
void addTicket(String ticketID, String customerName, String movieName, String seatNumber, String bookingTime) {
Ticket newTicket = new Ticket(ticketID, customerName, movieName, seatNumber, bookingTime);
if (head == null) {
head = newTicket;
head.next = head;
return;
}
Ticket temp = head;
while (temp.next != head) {
temp = temp.next;
}
temp.next = newTicket;
newTicket.next = head;
}
void removeTicket(String ticketID) {
if (head == null) {
return;
}
Ticket temp = head, prev = null;
do {
if (temp.ticketID.equals(ticketID)) {
if (prev != null) {
prev.next = temp.next;
} else {
Ticket last = head;
while (last.next != head) {
last = last.next;
}
head = head.next;
last.next = head;
}
return;
}
prev = temp;
temp = temp.next;
} while (temp != head);
}
void displayTickets() {
if (head == null) {
System.out.println("No tickets booked.");
return;
}
Ticket temp = head;
do {
System.out.println("Ticket ID: " + temp.ticketID + ", Customer: " + temp.customerName + ", Movie: " + temp.movieName + ", Seat: " + temp.seatNumber + ", Time: " + temp.bookingTime);
temp = temp.next;
} while (temp != head);
}
int countTickets() {
if (head == null) {
return 0;
}
int count = 0;
Ticket temp = head;
do {
count++;
temp = temp.next;
} while (temp != head);
return count;
}
}

public class TicketSystemApp {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
TicketReservationSystem trs = new TicketReservationSystem();
trs.addTicket("T1", "Abhinav", "Pushpa 2", "A1", "10:00 AM");
trs.addTicket("T2", "Altaf", "Animal", "B2", "1:00 PM");
trs.displayTickets();
System.out.println("Total Tickets: " + trs.countTickets());
trs.removeTicket("T1");
trs.displayTickets();
System.out.println("Total Tickets: " + trs.countTickets());
scanner.close();
}
}

