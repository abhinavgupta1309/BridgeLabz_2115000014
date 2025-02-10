import java.util.*;
abstract class FoodItem {
private String itemName;
private double price;
private int quantity;
public FoodItem(String itemName, double price, int quantity) {
this.itemName = itemName;
this.price = price;
this.quantity = quantity;
}
public String getItemName() {
return itemName;
}
public double getPrice() {
return price;
}
public int getQuantity() {
return quantity;
}
public String getItemDetails() {
return "Item: " + itemName + ", Price: " + price + ", Quantity: " + quantity;
}
public abstract double calculateTotalPrice();
}
interface Discountable {
void applyDiscount(double percentage);
String getDiscountDetails();
}
class VegItem extends FoodItem {
public VegItem(String itemName, double price, int quantity) {
super(itemName, price, quantity);
}
@Override
public double calculateTotalPrice() {
return getPrice() * getQuantity();
}
}
class NonVegItem extends FoodItem implements Discountable {
private static final double NON_VEG_SURCHARGE = 1.10;
private double discount = 0.0;
public NonVegItem(String itemName, double price, int quantity) {
super(itemName, price, quantity);
}

@Override
public double calculateTotalPrice() {
return (getPrice() * getQuantity() * NON_VEG_SURCHARGE) - discount;
}

@Override
public void applyDiscount(double percentage) {
discount = (getPrice() * getQuantity() * NON_VEG_SURCHARGE) * (percentage / 100);
}

@Override
public String getDiscountDetails() {
return "Discount Applied: " + discount;
}
}
public class OnlineFoodDeliverySystem {
public static void main(String[] args) {
List<FoodItem> order = new ArrayList<>();

VegItem vegItem = new VegItem("Paneer Butter Masala", 250, 2);
NonVegItem nonVegItem = new NonVegItem("Chicken Biryani", 300, 1);
order.add(vegItem);
order.add(nonVegItem);

nonVegItem.applyDiscount(10);

for (FoodItem item : order) {
System.out.println(item.getItemDetails());
System.out.println("Total Price: " + item.calculateTotalPrice());
if (item instanceof Discountable) {
Discountable discountable = (Discountable) item;
System.out.println(discountable.getDiscountDetails());
}
System.out.println("--------------------------");
}
}
}

