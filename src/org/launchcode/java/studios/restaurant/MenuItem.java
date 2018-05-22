package org.launchcode.java.studios.restaurant;

import java.util.Date;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return Objects.equals(name, menuItem.name) &&
                Objects.equals(category, menuItem.category) &&
                Objects.equals(description, menuItem.description);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, category, description);
    }

    public double getMenuItemPrice() {
        return price;
    }
    public Date getMenuItemDate() {
        return addedIn;
    }
    public boolean isMenuItemNew() {
        Date rightNow = new Date();
        long twoMonths = 5184000000L; //2 months in milliseconds
        if ((rightNow.getTime() - addedIn.getTime()) > twoMonths ) {
            isNew = false;
        } else {
            isNew = true;
        }
        return isNew;
    }
}
