/* Copyright © 2016 Oracle and/or its affiliates. All rights reserved. */

package practice_08_2;

public class ShoppingCart {
    public static void main (String[] args){
        Item item1 = new Item();
        
        // Call the 3-arg setItemFields method and then call displayItem.
        item1.setItemFields("olea", 10, 11.2);
        item1.displayItem();

        // Call the 4-arg setItemFields method, checking the return value.
        item1.setItemFields("jenea",20, 23.5);
        if (item1.setItemFields("jenea",20,23.5, ' ') < 0)
            System.out.println("Invalid color message");
        else item1.displayItem();
    } 
}
