import java.util.Scanner;
class Item {
String itemName;
String itemID;
int quantity;
double price;
Item next;
Item(String itemName, String itemID, int quantity, double price) {
this.itemName = itemName;
this.itemID = itemID;
this.quantity = quantity;
this.price = price;
this.next = null;
}
}

class Inventory {
Item head;
void addItemAtBeginning(String itemName, String itemID, int quantity, double price) {
Item newItem = new Item(itemName, itemID, quantity, price);
newItem.next = head;
head = newItem;
}
void addItemAtEnd(String itemName, String itemID, int quantity, double price) {
Item newItem = new Item(itemName, itemID, quantity, price);
if (head == null) {
head = newItem;
return;
}
Item temp = head;
while (temp.next != null) {
temp = temp.next;
}
temp.next = newItem;
}
void addItemAtPosition(String itemName, String itemID, int quantity, double price, int position) {
Item newItem = new Item(itemName, itemID, quantity, price);
if (position == 1) {
addItemAtBeginning(itemName, itemID, quantity, price);
return;
}
Item temp = head;
for (int i = 1; temp != null && i < position - 1; i++) {
temp = temp.next;
}
if (temp == null) {
return;
}
newItem.next = temp.next;
temp.next = newItem;
}
void removeItemByID(String itemID) {
if (head == null) {
return;
}
if (head.itemID.equals(itemID)) {
head = head.next;
return;
}
Item temp = head;
while (temp.next != null && !temp.next.itemID.equals(itemID)) {
temp = temp.next;
}
if (temp.next == null) {
return;
}
temp.next = temp.next.next;
}
void updateQuantityByID(String itemID, int newQuantity) {
Item temp = head;
while (temp != null) {
if (temp.itemID.equals(itemID)) {
temp.quantity = newQuantity;
return;
}
temp = temp.next;
}
}
Item searchItemByIDorName(String key) {
Item temp = head;
while (temp != null) {
if (temp.itemID.equals(key) || temp.itemName.equals(key)) {
return temp;
}
temp = temp.next;
}
return null;
}
double calculateTotalInventoryValue() {
double totalValue = 0;
Item temp = head;
while (temp != null) {
totalValue += temp.price * temp.quantity;
temp = temp.next;
}
return totalValue;
}
void displayItems() {
Item temp = head;
while (temp != null) {
System.out.println(temp.itemName + " " + temp.itemID + " " + temp.quantity + " " + temp.price);
temp = temp.next;
}
}
}

public class InventoryManagementSystem {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
Inventory inventory = new Inventory();
inventory.addItemAtBeginning("Laptop", "I1", 5, 800.00);
inventory.addItemAtEnd("Phone", "I2", 10, 500.00);
inventory.addItemAtPosition("Tablet", "I3", 7, 300.00, 2);
inventory.displayItems();
inventory.removeItemByID("I2");
inventory.displayItems();
inventory.updateQuantityByID("I1", 8);
inventory.displayItems();
System.out.println("Total Inventory Value: " + inventory.calculateTotalInventoryValue());
scanner.close();
}
}
