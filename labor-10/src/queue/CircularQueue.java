package queue;

public class CircularQueue implements IQueue{

    private final int capacity;
    private Object[] items;
    private int front;
    private int rear;

    public CircularQueue(int capacity){
        this.capacity=capacity;
        this.items = new Object[capacity];
        this.front = -1;
        this.rear = -1;
    }


    @Override
    public boolean isEmpty() {
        return front == -1;
    }

    @Override
    public boolean isFull() {
        if (items.length == capacity) {
            return true;
        }
        return false;
    }

    @Override
    public void enQueue(Object obj) {  //mindig rear pozocioratesz

    }

    @Override
    public Object deQueue() {   //mindig elejerol vesz ki ha tud
        return null;
    }

    @Override
    public void printQueue() {

    }
}
