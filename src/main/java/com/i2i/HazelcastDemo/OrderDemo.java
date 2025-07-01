package com.i2i.HazelcastDemo;

import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.map.IMap;

public class OrderDemo {
    public static void main(String[] args) {
        HazelcastInstance hz = Hazelcast.newHazelcastInstance();

        // Create distributed maps
        IMap<Integer, Customer> customerMap = hz.getMap("customers");
        IMap<Integer, Item> itemMap = hz.getMap("items");

        // Add sample data
        customerMap.put(1, new Customer("Atena", "Istanbul", "555-123"));
        itemMap.put(101, new Item("Warehouse-A", "Shelf-3"));

        // Simulate incoming order
        int orderNumber = 5001;
        int customerId = 1;
        int itemNumber = 101;

        // Look up data from maps
        Customer customer = customerMap.get(customerId);
        Item item = itemMap.get(itemNumber);

        // Print final enriched order (simulate Order Processing)
        System.out.println("Order #" + orderNumber);
        System.out.println("Customer: " + customer.name + ", " + customer.address + ", " + customer.phone);
        System.out.println("Item: " + item.warehouse + ", " + item.shelf);

        hz.shutdown();
    }
}
