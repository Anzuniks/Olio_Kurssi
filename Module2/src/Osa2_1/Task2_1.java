//Module 2 from 2.1 Task 1//
package Osa2_1;

//Let create a classes//
    class Television {
    private int channel = 1;
    private boolean on = false;

    public int getChannel() {
        return this.channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }
    public boolean isOn() {
        return this.on;
    }

    public void pressOnOff() {
        this.on = !this.on;
    }
}

public class Task2_1 {
    public static void main(String[] args) {
        Television myTV = new Television();


        //Lets make the for loop for going trough the each day//
        for (int day = 1; day <= 10; day++) {
            System.out.println("Woke up, day " + day);


            //I am going to add if statement for the tv if its on or off//
            if (!myTV.isOn()) {
                myTV.pressOnOff();
            }

            int channelsToWatch;
            if (day % 2 != 0)  {
                channelsToWatch = (day == 1) ? 3 : 6;
            } else {
                channelsToWatch = 4;
            }


            int watchedCount = 0;
            while (watchedCount < channelsToWatch) {
                System.out.println("Watching channel " + myTV.getChannel());

                int next = myTV.getChannel() + 1;
                if (next > 10) {
                    next = 1;
                }
                myTV.setChannel(next);


                watchedCount++;
            }

            if (myTV.isOn()) {
                myTV.pressOnOff();
            }
            System.out.println("Falling asleep");
        }
    }
}