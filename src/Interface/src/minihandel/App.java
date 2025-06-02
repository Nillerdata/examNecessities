package Interface.src.minihandel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) {
        Product p1 = new Product(1,"Piña colada",50);
        Product p2 = new Product(2,"Darth vaders",250);
        Product p3 = new Product(3,"Lasses værdighed",10);
        Product p4 = new Product(4,"min værdighed",5);
        Product p5 = new Product(5,"Computer",10000);



        Customer c1 = new Customer("Niels", LocalDate.of(2000,4,2));
        Customer c2 = new Customer("Johnny",LocalDate.of(1995,7,23));

        Order order1 = new Order(1);
        Order order2 = new Order(2);
        Order order3 = new Order(3);
        Order order4 = new Order(4);
        Order order5 = new Order(5);
        Order order6 = new Order(6);

        OrderLine l1 = order1.createOrderLine(1,p1);
        OrderLine l2 =order1.createOrderLine(4,p3);

        OrderLine l3 =order2.createOrderLine(1,p2);
        OrderLine l4 =order2.createOrderLine(1,p4);

        OrderLine l5 =        order3.createOrderLine(2,p5);
        OrderLine l6 =order3.createOrderLine(2,p4);

        OrderLine l7 = order4.createOrderLine(2,p3);
        OrderLine l8 = order4.createOrderLine(2,p2);

        OrderLine l9 = order5.createOrderLine(5,p5);
        OrderLine l10 = order5.createOrderLine(4,p3);

        OrderLine l11 =  order6.createOrderLine(1,p4);
        OrderLine l12 =order6.createOrderLine(3,p3);

        ArrayList<OrderLine>orderLines = new ArrayList<>();
        orderLines.add(l1);
        orderLines.add(l8);
        orderLines.add(l2);
        orderLines.add(l3);
        orderLines.add(l4);
        orderLines.add(l5);
        orderLines.add(l6);
        orderLines.add(l7);
        orderLines.add(l9);
        orderLines.add(l10);
        orderLines.add(l11);
        orderLines.add(l12);

        Collections.sort(orderLines);
        Collections.reverse(orderLines);
        System.out.println(orderLines);
        c1.addOrder(order1);
        c1.addOrder(order2);

        c2.addOrder(order3);
        c2.addOrder(order4);
        c2.addOrder(order5);
        c2.addOrder(order6);

        System.out.println(c1.totalBuy());
        System.out.println(c2.totalBuy());
        PercentDiscount pd1 = new PercentDiscount(15);
        FixedDiscount fd1 = new FixedDiscount(250,1000);
        c1.setDiscount(pd1);
        c2.setDiscount(fd1);
        System.out.println(c1.totalBuyWithDiscount());
        System.out.println(c2.totalBuyWithDiscount());

    }
}
