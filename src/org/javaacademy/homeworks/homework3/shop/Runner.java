package org.javaacademy.homeworks.homework3.shop;

public class Runner {
    public static void main(String[] args) {
        Customer customer = new Customer("Константин");
        Shop shop = new Shop(true, false, 1);
        customer.checkShop(shop);
    }
}
