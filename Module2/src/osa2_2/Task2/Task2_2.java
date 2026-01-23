package osa2_2.Task2;


import java.util.ArrayList;
import java.util.HashMap;

class GroceryListManagerNew {
    //Modifying adding the hashmap//
    private HashMap<String, Double> groceryList = new HashMap<>();

    //Adding the methods//
    public boolean checkItem(String item) {
        return groceryList.containsKey(item);
    }





    public void addItem(String item, double cost) {
        groceryList.put(item, cost);
    }
    public void removeItem(String item) {
        groceryList.remove(item);
    }


    public void displayList() {
        for (String item : groceryList.keySet()) {
            System.out.println("- " + item + ": " + groceryList.get(item) +  "€");
        }
    }

    public double calculateTotalCost() {
        double total = 0.0;
        for (double cost :  groceryList.values()) {
            total += cost;
        }
        return total;
    }

}

public class Task2_2 {
    public static void main(String [] args) {
        GroceryListManagerNew myManager = new GroceryListManagerNew();

        //Adding the item//
        myManager.addItem("Milk", 1.5);
        myManager.addItem("Eggs", 2.90);
        myManager.addItem("Bread", 2.10);

        System.out.println("Grocery List:");
        myManager.displayList();

        System.out.println("\nTotal Cost: " + myManager.calculateTotalCost() + "€");

        System.out.println("\nIs Milk int the grocery list? " + myManager.checkItem("Milk"));

        //Remove the items//
        System.out.println("\nRemoving Milk from the list...");
        myManager.removeItem("Milk");

        System.out.println("\nUpdated Grocery List:");
        myManager.displayList();

        System.out.println("New total cost: " + myManager.calculateTotalCost());

    }
}
