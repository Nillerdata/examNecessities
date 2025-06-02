package Interface.src.minihandel;

import opg_2.Customer;

import java.util.ArrayList;
import java.util.List;

/**
 * Models an Order with OrderLines and an order number. 
 */
public class Order implements Comparable<Order> {
    private int number;
    private List<OrderLine> orderLines = new ArrayList<OrderLine>();

    /**
     * Create the order.
     * @param number a sequential number given to each Order in the system.
     */
    public Order(int number) {
        this.number = number;
    }

    public int getNumber() {
        return this.number;
    }

    /**
     * Create a new order line with the given product.
     * @param count the amount of products in this line. Must be >= 1.
     * @param product the product ordered.
     */
    public OrderLine createOrderLine(int count, Product product) {
        OrderLine line = new OrderLine(orderLines.size() + 1, count, product,this);
        orderLines.add(line);
        return line;
    }

    public List<OrderLine> getOrderLines() {
        return new ArrayList<OrderLine>(orderLines);
    }

    public double getOrderPrice(){
        double pris = 0;
        for (OrderLine orderLine : orderLines) {
            pris += orderLine.getOrderLinePrice();
        }
        return pris;
    }
    @Override
    public int compareTo(Order order) {
        return number - order.number;
    }

    @Override
    public String toString() {
        return "order" + number;
    }
}
