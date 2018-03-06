/* Copyright © 2016 Oracle and/or its affiliates. All rights reserved. */

package practice_08_1;

public class Item {
    char color;

    public boolean setColor(char color_code){
        if (color_code == ' ')
            return false;
        else {
            this.color = color_code;
            return true;
        }
    }
    
    // Declare and code the setColor method
    
}
