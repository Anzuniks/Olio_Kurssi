//Task 3 from 2.1//

package Osa2_1;

//Lets make CoffeeMaker class//
class CoffeeMaker {
    private boolean on = false;
    private int type = 1;
    private int amount = 10;

    public boolean isOn() {
        return this.on;
    }
    public void pressPowerButton() {
        this.on = !this.on;
    }
    public void setType(int type) {
        if (this.on) {
            if (type == 1 || type == 2) {
                this.type = type;

            }
        }

    }

    public void setAmount(int amount) {
        if (this.on) {
            if (amount >= 10 && amount <= 80) {
                this.amount = amount;
            }
        }
    }
    public String getType() {
        if (this.type == 2) return "espresso";
        return "normal";
    }
    public int getAmount() {
        return this.amount;
    }
}

public class Task2_3 {
    public static void main(String [] args) {
        CoffeeMaker myMaker = new CoffeeMaker();

        myMaker.pressPowerButton();
        if (myMaker.isOn()) {
            System.out.println("Coffee maker is on");
        }

        myMaker.setType(2);
        System.out.println("Coffee type is " + myMaker.getType());

        myMaker.setAmount(50);
        System.out.println("Coffee amount is " +  myMaker.getAmount() + " ml ");

        myMaker.pressPowerButton();
        if (!myMaker.isOn()) {
            System.out.println("Coffee maker is off");
        }
    }
}
