import java.util.ArrayList;
class Product {
        private String name;
        private double price;
        public Product(String name, double price) {
        this.name = name;
        this.price = price;
}
        public String getName() {
        return name;
}
        public double getPrice() {
        return price;
}
}
class Order {
        private ArrayList<Product> products;
        public Order() {
        this.products = new ArrayList<>();
}
        public void addProduct(Product product) {
        products.add(product);
}
        public void displayOrder() {
        System.out.println("Order Details:");
        for (Product product : products) {
        System.out.println("Product: " + product.getName() + ", Price: " + product.getPrice());
}
}
}
class Customer {
        private String name;
        private ArrayList<Order> orders;
    
        public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
}
        public void placeOrder(Order order) {
        orders.add(order);
}
        public void displayOrders() {
        System.out.println("Customer: " + name + " Orders:");
        for (Order order : orders) {
        order.displayOrder();
}
}
}
public class OrderProducts {
public static void main(String[] args) {
        Customer customer = new Customer("Abhinav");
        
        Product product1 = new Product("Laptop", 1200.00);
        Product product2 = new Product("Phone", 800.00);
        
        Order order1 = new Order();
        order1.addProduct(product1);
        order1.addProduct(product2);
        
        customer.placeOrder(order1);
        customer.displayOrders();
}
}

