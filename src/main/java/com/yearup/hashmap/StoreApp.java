package com.yearup.hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class StoreApp {
    public static void main(String[] args) {
        // this method loads product objects into inventory
        loadInventory();
        Scanner scanner = new Scanner(System.in);
        System.out.print("What item # are you interested in? ");
        int id = scanner.nextInt();
        Product matchedProduct = inventory.get(id);
        if (matchedProduct == null) {
            System.out.println("We don't carry that product");
            return;
        }
        System.out.printf("We carry %s and the price is $%.2f", matchedProduct.getName(), matchedProduct.getPrice());
    }

    static HashMap<Integer, Product> inventory =
            new HashMap<Integer, Product>();

    public static void loadInventory() {
        for (Product p : Inventory.inventory) {
            inventory.put(p.getId(), p);
        }
    }
}

