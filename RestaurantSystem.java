class Person {
String name;
int id;
Person(String name, int id) {
        this.name = name;
        this.id = id;
}
}
interface Worker {
void performDuties();
}
class Chef extends Person implements Worker {
String specialty;
Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
}
public void performDuties() {
        System.out.println("Chef - Name: " + name + ", ID: " + id + ", Specialty: " + specialty + " - Cooking meals");
}
}
class Waiter extends Person implements Worker {
int tablesAssigned;
Waiter(String name, int id, int tablesAssigned) {
        super(name, id);
        this.tablesAssigned = tablesAssigned;
}
public void performDuties() {
        System.out.println("Waiter - Name: " + name + ", ID: " + id + ", Tables Assigned: " + tablesAssigned + " - Serving customers");
}
}
public class RestaurantSystem {
public static void main(String[] args) {
        Chef chef = new Chef("Walter White", 101, "Blue Meth");
        Waiter waiter = new Waiter("Jessie Pinkman", 102, 5);
        chef.performDuties();
        waiter.performDuties();
}
}
