package org.launchcode.java.studios.restaurant;

import java.util.Date;

public class Menu {

    private static Date lastUpdated = new Date();
    protected static String[] categories = {"appetizer", "main course", "dessert"};
    private MenuItem menuItems = new MenuItem();

    public Menu() {
        Date lastUpdated = new Date();
    }

    public void setMenu() {
        MenuItem menuItems = new MenuItem();
        Date lastUpdated = new Date();
    }
    public void setMenu(String aName, int aCategory, String aDescription, double aPrice) {
        MenuItem menuItems = new MenuItem(aName, categories[aCategory], aDescription, aPrice);
        Date lastUpdated = new Date();
    }
    public MenuItem getMenu() {
        return menuItems;
    }
}
