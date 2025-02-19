import java.util.*;

class ShoppingCart {
    private Map<String, Double> productPrices = new HashMap<>();
    private Map<String, Integer> cart = new LinkedHashMap<>();

    public ShoppingCart() {
        productPrices.put("Laptop", 50000.0);
        productPrices.put("Phone", 20000.0);
        productPrices.put("Headphones", 1500.0);
        productPrices.put("Smartwatch", 5000.0);
        productPrices.put("Tablet", 25000.0);
    }

    public void addItem(String product, int quantity) {
        if (productPrices.containsKey(product)) {
            cart.put(product, cart.getOrDefault(product, 0) + quantity);
        }
    }

    public void displayCart() {
        System.out.println("Shopping Cart:");
        for (Map.Entry<String, Integer> entry : cart.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue() + " pcs - INR " + productPrices.get(entry.getKey()));
        }
    }

    public void displaySortedByPrice() {
        TreeMap<Double, String> sortedByPrice = new TreeMap<>();
        for (String product : cart.keySet()) {
            sortedByPrice.put(productPrices.get(product), product);
        }
        System.out.println("Items sorted by price:");
        for (Map.Entry<Double, String> entry : sortedByPrice.entrySet()) {
            System.out.println(entry.getValue() + " - INR " + entry.getKey());
        }
    }

    public static void main(String[] args) throws Exception {
        System.setOut(new java.io.PrintStream(System.out, true, "UTF-8"));
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Laptop", 1);
        cart.addItem("Phone", 2);
        cart.addItem("Smartwatch", 1);
        cart.addItem("Headphones", 3);
        cart.displayCart();
        cart.displaySortedByPrice();
    }
}
