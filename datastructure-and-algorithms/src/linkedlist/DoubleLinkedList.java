package src.linkedlist;

public class DoubleLinkedList {
    private DoubleLinkNode head;
    private DoubleLinkNode tail;

    public DoubleLinkedList() {
    }

    public DoubleLinkNode getTail() {
        return tail;
    }

    public void setTail(DoubleLinkNode tail) {
        this.tail = tail;
    }

    public DoubleLinkNode getHead() {
        return head;
    }

    public void setHead(DoubleLinkNode head) {
        this.head = head;
    }

    public void append(Integer data) {
        DoubleLinkNode node = new DoubleLinkNode(data);
        if (head == null) {
            node.setPrevNode(null);
            node.setNextNode(null);
            this.head = node;
            this.tail = node;
        } else {
            DoubleLinkNode currentTail = this.tail;
            node.setPrevNode(currentTail);
            currentTail.setNextNode(node);
            node.setNextNode(null);
            this.tail = node;
        }
    }

    public void addNodeAfter(DoubleLinkNode beforeNode, Integer data) {
    }

    public void prepend(Integer data) {
    }


    public void printForwardPretty() {

    }

    public void printBackwardPretty() {

    }

    public void deleteNode(DoubleLinkNode node) {

    }
}
