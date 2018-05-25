package org.launchcode.java.studios.restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {

    private static Date lastUpdated = new Date();
    private static String[] categories = {"appetizer", "main course", "dessert"}; //0, 1 or 2
    private ArrayList<MenuItem> menuItems = new ArrayList<>();

    public Menu() {
        Date lastUpdated = new Date();
    }

    public void setMenu() {
        MenuItem newMenuItem = new MenuItem();
        this.menuItems.add(newMenuItem);
        Date lastUpdated = new Date();
    }
    public void setMenu(String aName, int aCategory, String aDescription, double aPrice) {
        MenuItem newMenuItem = new MenuItem(aName, categories[aCategory], aDescription, aPrice);
        this.menuItems.add(newMenuItem);
        Date lastUpdated = new Date();
    }
    public ArrayList<MenuItem> getMenu() {
        return menuItems;
    }
    public Date getMenuDate() { return lastUpdated; }
    public String[] menuCategories() { return categories; }
}
