package entities;

import enums.OrderStatus;

import java.util.Date;

public class Order {
    private Integer id; //id do pedido.
    private Date moment; //momento exato do pedido.
    private OrderStatus status; //chamando os condição do pedido
    public Order() {

    }
    public Order(Integer id, Date moment, OrderStatus status) {
        this.id = id;
        this.moment = moment;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", moment=" + moment +
                ", status=" + status +
                '}';
    }
}
