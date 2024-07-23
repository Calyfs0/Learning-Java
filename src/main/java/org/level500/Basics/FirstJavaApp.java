package org.level500.Basics;

import org.level500.shop.Address;
import org.level500.shop.Customer;
import org.level500.shop.VipCustomer;
import java.util.Collections;

/*
* Learning Java
 */
public class FirstJavaApp {
    public static void main(String[] args) {
        //Vip Customer
        Customer vipCustomer = new VipCustomer();

        //Defining address
        Address sagarAddress = new Address();
        sagarAddress.setStreet("Silicon Street");
        sagarAddress.setNumber("500");

        //Setting customer values
        vipCustomer.setName("Sagar");
        vipCustomer.setInterests(Collections.singletonList("Coding"));
        vipCustomer.setAddress(sagarAddress);

        //Printing the information
        System.out.println(vipCustomer.getName() + " loves " + vipCustomer.getInterests().getFirst());
        System.out.println(vipCustomer.getName() + " lives at " + vipCustomer.getAddress());
        vipCustomer.returnItems("Hard disk");

        Customer customer = new Customer();

        //Defining address
        Address chitraAddress = new Address();
        chitraAddress.setStreet("Sugar Street");
        chitraAddress.setNumber("500");

        //Setting customer values
        customer.setName("Chitra");
        customer.setInterests(Collections.singletonList("Cooking"));
        customer.setAddress(chitraAddress);

        //Printing the information
        System.out.println(customer.getName() + " loves " + customer.getInterests().getFirst());
        System.out.println(customer.getName() + " lives at " + customer.getAddress());
        customer.returnItems("Rice");

        //Defining address
        Address sapnaAddress = new Address();
        sapnaAddress.setStreet("Broom Street");
        sapnaAddress.setNumber("500");

        //Setting customer values
        Customer anotherCustomer = new Customer("Sapna", Collections.singletonList("Cleaning"), sapnaAddress);

        //Printing the information
        System.out.println(anotherCustomer.getName() + " loves " + anotherCustomer.getInterests().getFirst());
        System.out.println(anotherCustomer.getName() + " lives at " + anotherCustomer.getAddress());
        anotherCustomer.returnItems("Mop");

    }
}
