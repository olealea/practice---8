/* Copyright © 2016 Oracle and/or its affiliates. All rights reserved. */

package practice_08_1;

public class ShoppingCart {
    public static void main(String[] args) {
        Item item1 = new Item();
        if (item1.setColor('B'))
            System.out.println(item1.color);
        else System.out.println("Invalid color");

    }
    // Call the setColor method on item1.
    // Print an appropriate message, depending upon the return value.
}