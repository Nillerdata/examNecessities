package Interface.src.opg_2;

import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) {
        Customer c1 = new Customer("Lasse", "Jepsen", 25);
        Customer c2 = new Customer("Sean", "Bateman", 42);
        Customer c3 = new Customer("Jacob", "Kristensen", 28);
        Customer c4 = new Customer("Magnus", "Dammeyer", 28);


        //customer til aftercustomer
        Customer c5 = new Customer("Tobias", "Kromand", 28);

        //-------------------------------------------


        Customer[] customers = {c1, c2, c3, c4};
        System.out.println(lastCustomer(customers));
        System.out.println(afterCustomer(customers, c5));
    }

    public static Customer lastCustomer(Customer[] customers) {
        Customer cus = customers[0];
        for (int i = 1; i < customers.length - 1; i++) {
            if (cus.compareTo(customers[i]) < 0) {
                cus = customers[i];
            }

        }
        return cus;
    }

    public static ArrayList<Customer> afterCustomer(Customer[] customers,
                                                    Customer customer) {
        ArrayList<Customer> customerArrayList = new ArrayList<>();
        for (Customer customer1 : customers) {
            if (customer1.compareTo(customer) > 0) {
                customerArrayList.add(customer1);
            }
        }
        Collections.sort(customerArrayList);
        return customerArrayList;
    }

}
