import java.util.*;
abstract class WarehouseItem {
    private String name;
    public WarehouseItem(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
class Electronics extends WarehouseItem {
    public Electronics(String name) {
        super(name);
    }
}
class Groceries extends WarehouseItem {
    public Groceries(String name) {
        super(name);
    }
}
class Furniture extends WarehouseItem {
    public Furniture(String name) {
        super(name);
    }
}
class Storage<T extends WarehouseItem> {
    private List<T> items = new ArrayList<>();
    public void addItem(T item) {
        items.add(item);
    }
    public T getItem(int index) {
        return items.get(index);
    }
    public void displayItems() {
        for (WarehouseItem item : items) {
            System.out.println(item.getName());
        }
    }
}
public class SmartWarehouse {
    public static void main(String[] args) {
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Tablet"));
        electronicsStorage.addItem(new Electronics("Laptop"));
        Storage<Groceries> groceriesStorage = new Storage<>();
        groceriesStorage.addItem(new Groceries("Tooth paste"));
        groceriesStorage.addItem(new Groceries("Bread"));
        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Bed"));
        furnitureStorage.addItem(new Furniture("Table"));
        System.out.println("Electronics:");
        electronicsStorage.displayItems();
        System.out.println("Groceries:");
        groceriesStorage.displayItems();
        System.out.println("Furniture:");
        furnitureStorage.displayItems();
    }
}