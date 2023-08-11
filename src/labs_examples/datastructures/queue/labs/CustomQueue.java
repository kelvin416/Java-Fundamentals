package labs_examples.datastructures.queue.labs;

import labs_examples.try_catch.CustomException;

public class CustomQueue <T> {
    int default_capacity = 10;
    double load_factor = 0.75;
    double shrink_factor = 0.25;
    int capacity;
    Object[] queue;
    int front;
    int rear;
    int size;

    public CustomQueue(int capacity) {
        this.capacity = capacity;
        this.queue = new Object[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public void enqueue(T item){
        if(isFull()){
            resizeArray(capacity * 2);
        }

        rear = (rear + 1) % capacity;
        queue[rear] = item;
        size++;

        if (size > capacity * load_factor){
            resizeArray(capacity * 2);
        }
    }

    public T dequeue(){
        if (isEmpty()){
            throw new CustomQueueException("Queue is Empty");
        }

        T removedItem = (T) queue[front];
        queue[front] = null;
        front = (front + 1) % capacity;
        size--;

        if (size < capacity * shrink_factor) {
            resizeArray(capacity / 2);
        }

        return removedItem;
    }

    public T peekFirst() {
        if (isEmpty()) {
            throw new CustomQueueException("Queue is empty");
        }

        T firstItem = (T) queue[front];
        return firstItem;
    }

    public T peekLast() {
        if (isEmpty()) {
            throw new CustomQueueException("Queue is empty");
        }

        T lastItem = (T) queue[rear];
        return lastItem;
    }

    public int size() {
        return size;
    }

    public void printQueue() {
        for (int i = 0; i < size; i++) {
            int index = (front + i) % capacity;
            System.out.print(queue[index] + " ");
        }
        System.out.println();
    }

    private void resizeArray(int newCapacity) {
        Object[] newQueue = new Object[newCapacity];
        for (int i = 0; i < size; i++) {
            newQueue[i] = queue[(front + i) % capacity];
        }
        queue = newQueue;
        front = 0;
        rear = size - 1;
        capacity = newCapacity;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean isFull(){
        return size == capacity;
    }
}

class CustomQueueException extends RuntimeException {
    public CustomQueueException(String message) {
        super(message);
    }
}
