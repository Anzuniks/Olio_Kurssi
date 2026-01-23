package osa2_2.Task1;


import java.util.ArrayList;

class GroceryListManager {
    private ArrayList<String> groceryList = new ArrayList<>();

    //Adding the methods//
    public boolean checkItem(String item) {
        return groceryList.contains(item);
    }


    public void addItem(String item) {
        groceryList.add(item);
    }
    public void removeItem(String item) {
        groceryList.remove(item);
    }

    public void displayList() {
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1 + " . " + groceryList.get(i)));
        }
    }

}

public class Task2_1 {
    public static void main(String [] args) {
        GroceryListManager myManager = new GroceryListManager();

        //Adding the item//
        myManager.addItem("Milk");
        myManager.addItem("Eggs");
        myManager.addItem("Bread");

        System.out.println("Grocery List:");
        myManager.displayList();

        System.out.println("\nIs Milk int the grocery list? " + myManager.checkItem("Milk"));

        //Remove the items//
        System.out.println("\nRemoving Milk from the list...");
        myManager.removeItem("Milk");

        System.out.println("\nUpdated Grocery List:");
        myManager.displayList();




    }
}
