package osa2_2;

import java.util.ArrayList;

// Task 3: Item-luokka, jossa on nimi, hinta ja kategoria
class ItemTask3 {
    String name;
    double cost;
    String category;

    public ItemTask3(String name, double cost, String category) {
        this.name = name;
        this.cost = cost;
        this.category = category;
    }
}

class GroceryListManagerNew2 {
    // KORJAUS: Käytetään ItemTask3-tyyppiä
    private ArrayList<ItemTask3> groceryList = new ArrayList<>();

    public void addItem(String item, double cost, String category) {
        groceryList.add(new ItemTask3(item, cost, category));
    }

    public void displayByCategory(String category) {
        System.out.println("Items in category: " + category);
        for (ItemTask3 item : groceryList) {
            if (item.category.equalsIgnoreCase(category)) {
                System.out.println("- " + item.name);
            }
        }
    }

    public boolean checkItem(String itemName) {
        for (ItemTask3 item : groceryList) {
            if (item.name.equals(itemName)) return true;
        }
        return false;
    }

    public void removeItem(String itemName) {
        groceryList.removeIf(item -> item.name.equals(itemName));
    }

    public void displayList() {
        for (int i = 0; i < groceryList.size(); i++) {
            ItemTask3 item = groceryList.get(i);
            System.out.println((i + 1) + ". " + item.name + " (" + item.category + ") - " + item.cost + "€");
        }
    }
}

public class Task2_3 {
    public static void main(String[] args) {
        // KORJAUS: Luokan nimi vastaamaan yllä olevaa
        GroceryListManagerNew2 myManager = new GroceryListManagerNew2();

        myManager.addItem("Milk", 1.5, "Dairy");
        myManager.addItem("Eggs", 2.90, "Dairy");
        myManager.addItem("Bread", 2.10, "Bakery");

        System.out.println("Grocery List:");
        myManager.displayList();

        System.out.println("\nIs Milk in the grocery list? " + myManager.checkItem("Milk"));

        System.out.println("\nItems in Dairy category:");
        myManager.displayByCategory("Dairy");

        System.out.println("\nRemoving Milk...");
        myManager.removeItem("Milk");

        System.out.println("\nUpdated Grocery List:");
        myManager.displayList();
    }
}