package Course2_Module8.Order;

public class Source {
    public static void main(String[] args) {
        Order order = new Order(1, "Apple Watch");
        System.out.println("id: " + order.getId() + ", name: " + order.getName());
    }
}