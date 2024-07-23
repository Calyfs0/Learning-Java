package org.level500.shop;

import java.util.List;

public class Customer {
    private String name;
    private List<String> interests;
    private Address address;

    public Customer(){

    }

    public Customer(String name, List<String> interests, Address address){
        this.name = name;
        this.interests = interests;
        this.address = address;
    }

    public void returnItems(String item){
        System.out.println("I would like to return " + item + ".");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getInterests() {
        return interests;
    }

    public void setInterests(List<String> interests) {
        this.interests = interests;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
