package org.launchcode.java.studios.restaurant;

import java.util.Date;

public class MenuItem {

    private Date addedIn = new Date();
    private String name;
    private String category;
    private String description;
    private double price;
    private boolean isNew;


    public MenuItem() {
        // default constructor
        Date addedIn = new Date();
        name = "New Item";
        category = "appetizer";
        description = "TBD";
        price = 1.0;
        isNew = true;
    }
    public MenuItem(String aName, String aCategory, String aDescription, double aPrice) {
        Date addedIn = new Date();
        name = aName;
        category = aCategory;
        description = aDescription;
        price = aPrice;
        isNew = true;
    }
    public void setMenuItem(String aName, String aCategory, String aDescription, double aPrice) {
        name=aName;
        category=aCategory;
        description=aDescription;
        price=aPrice;
        isMenuItemNew();
    }
    public String getMenuItemName() {
        return name;
    }
    public String getMenuItemCategory() {
        return category;
    }
    public String getMenuItemDescription() {
        return description;
    }
    public double getMenuItemPrice() {
        return price;
    }
    public Date getMenuItemDate() {
        return addedIn;
    }
    public boolean isMenuItemNew() {
        Date rightNow = new Date();
        long twoMonths = 5184000000; //2 months in milliseconds
        if ((rightNow.getTime() - addedIn.getTime()) > twoMonths ) {
            isNew = false;
        } else {
            isNew = true;
        }
    }
}
