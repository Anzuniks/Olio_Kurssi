package osa1_1.Task4;/*Task 4
I changed the name of this class to the task so i keep in here lets do the cat modifying task */


public class Task1_4 {
    private String name;

    public Task1_4(String name) {
        this.name = name;
    }

    public void meow() {
        System.out.println("The cat named " + name + " says: Meow!");
    }

    public static void main(String[] args) {
        // Create an instance of the Cat class with a name
        Task1_4 cat = new Task1_4("Whiskers");
        // I added whiskers in here so the print statement also it's gonna show Rex//
        Task1_4 cat2 = new Task1_4("Rex");

        // Call the meow method on the cat instance
        cat.meow(); //Whiskers meows
        cat.meow(); //Whiskers meows again
        cat2.meow(); //Rex meows
        cat.meow(); //Whiskers meows again



    }
}

