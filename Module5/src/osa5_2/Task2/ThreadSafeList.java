package osa5_2.Task2;

import java.util.ArrayList;

public class ThreadSafeList {
    private ArrayList<String> list = new ArrayList<>();

    public synchronized void addElement(String element) {
        list.add(element);

    }

    public synchronized int getSize() {
        return list.size();

    }

    public synchronized void removeElement(int index) {
        if (index >= 0 && index < list.size()) {
            list.remove(index);
        }
    }
}
