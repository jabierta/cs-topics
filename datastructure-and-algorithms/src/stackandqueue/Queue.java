package src.stackandqueue;


public class Queue {
    private int rear;
    private int front;
    private int numberOfItems;
    private Integer[] queue;

    // Queue is FIFO
    public Queue(Integer queueSize) {
        this.queue = new Integer[queueSize];
        this.numberOfItems = 0;
        this.front = 0;
        this.rear = queueSize - 1;
    }

    public void enqueue(Integer data) {
        if (!isFull()) {
            this.rear = (this.rear + 1) % queue.length;
            this.queue[this.rear] = data;
            this.numberOfItems++;
        } else {
            System.out.println("Queue is full!");
        }
    }

    public Integer dequeue() {
        Integer data = null;
        if (!isEmpty()) {
            data = this.queue[this.front];
            this.front = (this.front + 1) % queue.length;
            this.numberOfItems--;
        } else {
            System.out.println("Queue is empty!");
        }
        return data;
    }

    public Integer peek() {
        Integer data = null;
        if (!isFull()) {
            data = queue[this.front];
        } else {
            System.out.println("Queue is empty!");
        }
        return data;
    }

    public boolean isFull() {
        return numberOfItems == queue.length - 1;
    }

    public boolean isEmpty() {
        return numberOfItems == 0;
    }
}
