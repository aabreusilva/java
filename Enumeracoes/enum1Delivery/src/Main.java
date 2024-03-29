import entities.Order;
import enums.OrderStatus;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);

        //Transformando em string o OrderStatus.
        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus osEnviado = OrderStatus.valueOf("Entregue!");
    }
}