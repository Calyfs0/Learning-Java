package org.level500.Basics;

import org.level500.shop.Customer;
import org.level500.shop.VipCustomer;

import java.util.List;

public class FirstJavaApp {
    public static void main(String[] args){
        Customer vipCustomer = new VipCustomer();

        vipCustomer.setName("Sagar");
        vipCustomer.setInterests(List.of("Coding"));

        System.out.println(vipCustomer.getName() + " loves " + vipCustomer.getInterests().getFirst());


        Customer customer = new Customer();

        customer.setName("Chitra");
        customer.setInterests(List.of("Cooking"));

        System.out.println(customer.getName() + " loves " + customer.getInterests().getFirst());
    }
}
