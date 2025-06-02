package Interface.src.minihandel;

/**
 * Models an OrderLine in an Order.
 */
public class OrderLine implements Comparable<OrderLine> {
    private int lineNumber;
    private int count;
    private Order order;
    private Product product;

    /**
     * An line on the Order
     * @param lineNumber the line number. Must be >= 1 and sequential.
     * @param count the number of products in this line.
     * @param product the ordered product.
     */
    public OrderLine(int lineNumber, int count, Product product, Order order) {
        this.lineNumber = lineNumber;
        this.count = count;
        this.product = product;
        this.order = order;
    }
    
    public int getLineNumber() {
        return this.lineNumber;
    }

    public int getCount() {
        return this.count;
    }
   
    public Product getProduct() {
        return product;
    }

    public double getOrderLinePrice(){
        return product.getUnitPrice() * count;
    }

    @Override
    public int compareTo(OrderLine o) {
        int compare = this.order.compareTo(o.order);
        if(compare == 0){
            compare = this.lineNumber - o.lineNumber;
        }

        return compare;
    }

    @Override
    public String toString() {
        return "Order " + order + " linenumber " + lineNumber;
    }
}
