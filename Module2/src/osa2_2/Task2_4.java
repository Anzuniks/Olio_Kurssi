package osa2_2;


import java.util.ArrayList;

//Lets make the class to manage the grocery list with categories//

class ItemTask4 {
    String name;
    double cost;
    String category;
    int quantity;

    public ItemTask4(String name, double cost, String category, int quantity) {
        this.name = name;
        this.cost = cost;
        this.category = category;
        this.quantity = quantity;
    }
}

class GroceryListManagerNew4 {
    private ArrayList<ItemTask4> groceryList = new ArrayList<>();

    //Adding the methods//
    public boolean checkItem(String IteName) {
        for (ItemTask4 item : groceryList) {
            if (item.name.equals(IteName)) return true;
        }
        return false;
    }


    public void addItem(String item, double cost, String category, int quantity) {
        groceryList.add(new ItemTask4(item, cost, category, quantity));
    }


    public void updateQuantity(String itemName, int newQuantity) {
        for (ItemTask4 item : groceryList) {
            if (item.name.equals(itemName)) {
                item.quantity = newQuantity;
                break;
            }
        }
    }


    public void displayAvailableItems() {
        System.out.println("Available items: (quantity > 0)");
        for (ItemTask4 item : groceryList) {
            if (item.quantity > 0) {
                System.out.println(" - " + item.name + " (" + item.quantity + " kpl)");
            }
        }
    }


    public void removeItem(String itemName) {
        groceryList.removeIf(item -> item.name.equals(itemName));
    }

    public void displayList() {
        for (int i = 0; i < groceryList.size(); i++) {
            ItemTask4 item = groceryList.get(i);
            System.out.println((i + 1) + ". " + item.name + " (" +  item.category+") - " + item.cost + "€ | Amount:" + item.quantity);
        }
    }

    public void displayByCategory(String category) {
        System.out.println("Items in category:" + category);
        for (ItemTask4 item : groceryList) {
            if (item.category.equalsIgnoreCase(category)) {
                System.out.println("- " + item.name);
            }

        }

    }
}



public class Task2_4 {
    public static void main(String [] args) {
        GroceryListManagerNew4 myManager = new GroceryListManagerNew4();






        //Adding the item//
        myManager.addItem("Milk", 1.5, "Dairy", 2);
        myManager.addItem("Eggs" , 2.90, "Dairy", 12);
        myManager.addItem("Bread", 2.10, "Bakery", 1);

        System.out.println("Grocery List:");
        myManager.displayList();

        System.out.println("\nUpdating quantity of Eggs to 32...");
        myManager.updateQuantity("Eggs", 32);

        myManager.displayAvailableItems();

        System.out.println("\nIs Milk int the grocery list? " + myManager.checkItem("Milk"));

        //Remove the items//
        System.out.println("\nRemoving Milk from the list...");
        myManager.removeItem("Milk");

        System.out.println("\nUpdated Grocery List:");
        myManager.displayList();




    }
}
