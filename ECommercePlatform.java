import java.util.*;
abstract class Product {
    private int productId;
    private String name;
    private double price;
    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
}
    public int getProductId() {
        return productId;
}
    public String getName() {
        return name;
}
    public double getPrice() {
        return price;
}
    public void setPrice(double price) {
        this.price = price;
}
    public abstract double calculateDiscount();
}
interface Taxable {
    double calculateTax();
    String getTaxDetails();
}
class Electronics extends Product implements Taxable {
    private static final double TAX_RATE = 0.18;
    private static final double DISCOUNT_RATE = 0.10;
    public Electronics(int productId, String name, double price) {
        super(productId, name, price);
}
    @Override
    public double calculateDiscount() {
        return getPrice() * DISCOUNT_RATE;
}
    @Override
    public double calculateTax() {
        return getPrice() * TAX_RATE;
}
    @Override
    public String getTaxDetails() {
        return "Tax Rate: " + (TAX_RATE * 100) + "%";
}
}
class Clothing extends Product {
    private static final double DISCOUNT_RATE = 0.15;
    public Clothing(int productId, String name, double price) {
        super(productId, name, price);
}
    @Override
    public double calculateDiscount() {
        return getPrice() * DISCOUNT_RATE;
}
}
class Groceries extends Product {
    public Groceries(int productId, String name, double price) {
        super(productId, name, price);
}
    @Override
    public double calculateDiscount() {
        return 0;
}
}
public class ECommercePlatform {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        Electronics laptop = new Electronics(201, "Laptop", 80000);
        Clothing shirt = new Clothing(202, "Shirt", 1500);
        Groceries apple = new Groceries(203, "Apple", 200);

        products.add(laptop);
        products.add(shirt);
        products.add(apple);

        for (Product product : products) {
            double finalPrice = product.getPrice() - product.calculateDiscount();
            if (product instanceof Taxable) {
                finalPrice += ((Taxable) product).calculateTax();
            }
            System.out.println("Product: " + product.getName());
            System.out.println("Original Price: " + product.getPrice());
            System.out.println("Discount: " + product.calculateDiscount());
            if (product instanceof Taxable) {
                System.out.println(((Taxable) product).getTaxDetails());
                System.out.println("Tax: " + ((Taxable) product).calculateTax());
            }
            System.out.println("Final Price: " + finalPrice);
            System.out.println("--------------------------");
}
}
}

