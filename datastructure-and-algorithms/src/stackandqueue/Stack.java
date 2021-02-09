package src.stackandqueue;

public class Stack {
    private Integer maximumSize;
    private Integer indexOfTop;
    private Integer[] stack;

    // Stack is LIFO
    public Stack(Integer maximumSize) {
        this.maximumSize = maximumSize;
        this.indexOfTop = -1;
        this.stack = new Integer[maximumSize];
    }

    public void push(Integer data) {
        if (!isFull()) {
            indexOfTop++;
            stack[indexOfTop + 1] = data;
        } else {
            System.out.println("Stack is full!");
        }
    }

    public Integer pop() {
        Integer data = null;
        if (!isEmpty()) {
            data = stack[indexOfTop];
            stack[indexOfTop] = null;
            indexOfTop--;
        } else {
            System.out.println("Stack is emtpy!");
        }

        return data;

    }

    public Integer peek() {
        return null;
    }

    public boolean isFull() {
        boolean isFull = false;
        if (indexOfTop == maximumSize - 1) {
            isFull = true;
        }
        return isFull;
    }

    public boolean isEmpty() {
        boolean isEmpty = false;
        if (indexOfTop == -1) {
            isEmpty = true;
        }
        return isEmpty;
    }
}
