package edu.nwpu.rjwdz.builder;

import java.util.LinkedList;

/**
 * Created by lovywinsy on 1/16/17.
 */
public class Product {
    private LinkedList<String> parts;

    public Product() {
        parts = new LinkedList<>();
    }

    public void add(String part) {
        parts.addLast(part);
    }

    public void show() {
        System.out.println("Product completed as below :");
        for (int i = 0; i < parts.size(); ++i) {
            System.out.println(parts.get(i));
        }
    }
}
