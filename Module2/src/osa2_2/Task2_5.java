package osa2_2;


import java.util.ArrayList;

//Lets make the class to manage the grocery list with categories//

class ItemTask5 {
    String name;
    double cost;
    String category;
    int quantity;


    public ItemTask5(String name, double cost, String category, int quantity) {
        this.name = name;
        this.cost = cost;
        this.category = category;
        this.quantity = quantity;
    }
}

class GroceryListManagerNew5 {
    private ArrayList<ItemTask5> groceryList = new ArrayList<>();

    //Adding the methods//
    public boolean checkItem(String IteName) {
        for (ItemTask5 item : groceryList) {
            if (item.name.equals(IteName)) return true;
        }
        return false;
    }


    public void addItem(String item, double cost, String category, int quantity) {
        groceryList.add(new ItemTask5(item, cost, category, quantity));
    }

    public double calculateTotalCost() {
        double total = 0.0;
        for (ItemTask5 item : groceryList) {
            total += item.cost * item.quantity;
        }
        return total;

    }


    public void updateQuantity(String itemName, int newQuantity) {
        for (ItemTask5 item : groceryList) {
            if (item.name.equals(itemName)) {
                item.quantity = newQuantity;
                break;
            }
        }
    }


    public void displayAvailableItems() {
        System.out.println("Available items: (quantity > 0)");
        for (ItemTask5 item : groceryList) {
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
            ItemTask5 item = groceryList.get(i);
            System.out.println((i + 1) + ". " + item.name + " (" +  item.category+ ") - " + item.cost + "€ | Amount:" + item.quantity);
        }
    }

    public void displayByCategory(String category) {
        System.out.println("Items in category:" + category);
        for (ItemTask5 item : groceryList) {
            if (item.category.equalsIgnoreCase(category)) {
                System.out.println("- " + item.name);
            }

        }

    }
}



public class Task2_5 {
    public static void main(String [] args) {
        GroceryListManagerNew5 myManager = new GroceryListManagerNew5();






        //Adding the item//
        System.out.println("Adding items to the list...");
        myManager.addItem("Milk", 1.5, "Dairy", 2);
        myManager.addItem("Eggs" , 2.90, "Dairy", 12);
        myManager.addItem("Bread", 2.10, "Bakery", 1);


        myManager.displayList();


        System.out.println("\nTotal cost: " + myManager.calculateTotalCost() + "€");

        myManager.displayByCategory("Dairy");

        System.out.println("\nUpdating quantity of Eggs to 32...");
        myManager.updateQuantity("Eggs", 32);

        System.out.printf("Final total cost:  %.2f€\n",  myManager.calculateTotalCost());

        myManager.displayList();








    }
}
