package queue;

import java.util.ArrayList;

public class ArrayListQueue implements IQueue {

    private ArrayList<Object> items = new ArrayList<>();
    private final int capacity;

    public ArrayListQueue(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public boolean isEmpty() {
        return items.isEmpty(); //-> Ez az ArrayListnek a beepitett isEmpty fuggvenye,nem a felso isEmpty!
    }

    @Override
    public boolean isFull() {
        if (items.size() == capacity) {
            return true;
        }
        return false;
    }

    @Override
    public void enQueue(Object obj) {
        //ha nincs tele beszurunk a vegere
        if (!isFull()) {
            items.add(obj);
        }
    }

    @Override
    public Object deQueue() {  //elejerol torol
        if (!isEmpty()) {
            return items.removeFirst();
        }
        return null;
    }

    @Override
    public void printQueue() {
        for (int i = 0; i < items.size(); i++) {
            System.out.print(items.get(i) + " ");
        }
        System.out.println();
    }
}
