public class DoublyLinkedList {
    private DoubleLinkNode head;
    private DoubleLinkNode tail;

    public DoublyLinkedList() {
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

    public void addNode(Integer data) {
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

    public void addNodeAfter(Integer data) {
    }

    public void printForwardPretty() {

    }

    public void printBackwardPretty() {

    }
}
