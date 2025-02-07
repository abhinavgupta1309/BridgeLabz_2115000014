class Order {
String orderId;
String orderDate;
Order(String orderId, String orderDate) {
	this.orderId = orderId;
        this.orderDate = orderDate;
}
String getOrderStatus() {
        return "Order placed on " + orderDate;
}
}
class ShippedOrder extends Order {
String trackingNumber;
ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
}
String getOrderStatus() {
        return "Order shipped with tracking number: " + trackingNumber;
}
}
class DeliveredOrder extends ShippedOrder {
String deliveryDate;
DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
}
String getOrderStatus() {
        return "Order delivered on " + deliveryDate;
}
}
public class OnlineRetailSystem {
public static void main(String[] args) {
        Order order = new Order("O123", "2025-02-07");
        ShippedOrder shippedOrder = new ShippedOrder("O124", "2025-02-06", "TRK12345");
        DeliveredOrder deliveredOrder = new DeliveredOrder("O125", "2025-02-05", "TRK67890", "2025-02-07");
        System.out.println(order.getOrderStatus());
        System.out.println(shippedOrder.getOrderStatus());
        System.out.println(deliveredOrder.getOrderStatus());
}
}

