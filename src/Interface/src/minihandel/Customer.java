package Interface.src.minihandel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Models a Customer with Orders.
 */
public class Customer implements Comparable<Customer> {
    private String name;
    private LocalDate birthday;
    private List<Order> orders = new ArrayList<Order>();
    private Discount discount;
    /**
     * Create a new Customer.
     * @param name the name.
     * @param birthday birthday of the customer.
     */
    public Customer(String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return this.birthday;
    }

    public List<Order> getOrders() {
        return new ArrayList<Order>(orders);
    }
    
    public void addOrder(Order order) {
        orders.add(order);
    }
    
    public void removeOrder(Order order) {
        orders.remove(order);
    }

    public double totalBuy(){
        double sum = 0;
        for (Order order : orders) {
            sum += order.getOrderPrice();
        }
        return sum;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }
    public double totalBuyWithDiscount() {
        double total = totalBuy();
        if (discount != null) {
            return discount.getDiscount(total);
        }
        else return total;
    }

    @Override
    public int compareTo(Customer cus) {
        int compare = this.name.compareTo(cus.name);
        if(compare == 0){
            compare = this.birthday.compareTo(cus.birthday);
        }
        return compare;
    }
}
