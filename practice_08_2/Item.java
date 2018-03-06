/* Copyright © 2016 Oracle and/or its affiliates. All rights reserved. */

package practice_08_2;

public class Item {
    String desc;
    int quantity;
    double price;
    char colorCode = 'U';   //'U' = Undetermined

    public void displayItem() {
        System.out.println("Item: " + desc + ", " + quantity + ", " + price + ", " + colorCode);
    }

    // Write a public 3-arg setItemFields method that returns void.
    public void setItemFields(String desc, int quantity, double price) {
        this.desc = desc;
        this.quantity = quantity;
        this.price = price;
    }

    // Write a public 4-arg setItemDisplay method that returns an int.
    public int setItemFields(String desc, int quantity, double price, char colorCode){
        if (colorCode != ' ') {
            this.colorCode = colorCode;
            this.setItemFields(desc, quantity, price);
            return 1;
    }
    else
        return -1;
    }
}


