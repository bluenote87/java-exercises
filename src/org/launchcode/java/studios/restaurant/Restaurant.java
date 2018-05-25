package org.launchcode.java.studios.restaurant;

import java.util.ArrayList;

public class Restaurant {
    public static void main(String[] args) {
        Menu theMenu=new Menu();
        theMenu.setMenu("Peas & Carrots", 0, "Classic peas & carrots", 1.0);
        theMenu.setMenu("Peanut Butter & Jelly", 0, "No bread, just two condiments!", 2.0);
        theMenu.setMenu("Meat & Potatoes", 1, "Butter your buns right this time!", 5.0);
        theMenu.setMenu("Fish From The Sea", 1, "It's from the ocean, what more could you want to know??", 11.0);
        theMenu.setMenu("Fried Bat", 1, "Many people refer to bats as 'chicken of the cave'.", 9.0);
        theMenu.setMenu("Ice Cream", 2, "Served in a mystery flavor that may or may not contain peanuts.", 4.0);
        theMenu.setMenu("Bar of Gold", 2, "Literally AU that you eat.", 500.0);
        System.out.println("This menu was last updated on " + theMenu.getMenuDate());
        ArrayList<MenuItem> menuContent = new ArrayList<>();
        menuContent = theMenu.getMenu();
        for (MenuItem item : menuContent) {
            System.out.print(item);
        }

    }
}
