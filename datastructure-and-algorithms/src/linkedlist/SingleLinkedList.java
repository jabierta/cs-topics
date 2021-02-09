package src.linkedlist;

public class SingleLinkedList {
    private SingleLinkNode head;

    public SingleLinkedList(SingleLinkNode head) {
        this.head = head;
    }

    public SingleLinkNode getHead() {
        return this.head;
    }

    public void setHead(SingleLinkNode newHead) {
        this.head = newHead;
    }

    public void append(SingleLinkNode node) {
        node.setNext(this.head);
        this.head = node;
    }

    public void prepend(SingleLinkNode node) {
        SingleLinkNode currentNode = this.head;
        while (currentNode != null) {
            if (currentNode.getNext() == null) {
                currentNode.setNext(node);
                break;
            }
            currentNode = currentNode.getNext();
        }
    }

    public void deleteHead() {
        if (this.head != null) {
            if (this.head.getNext() != null) {
                SingleLinkNode headReplacement = this.head.getNext();
                this.head = headReplacement;
            } else {
                this.head = null;
            }
        }
    }

    public void deleteNode(Integer data) {
        SingleLinkNode currentNode = this.head;
        SingleLinkNode previousNode = null;
        SingleLinkNode nextNode = null;
        while (currentNode != null) {
            nextNode = currentNode.getNext();
            if (currentNode.getData() == data) {
                if (previousNode == null) {
                    this.deleteHead();
                    currentNode = this.head;
                    if (currentNode.getNext() == null) {
                        this.deleteHead();
                        return;
                    }
                } else {
                    previousNode.setNext(nextNode);
                    currentNode = previousNode.getNext();
                }
            } else {
                previousNode = currentNode;
                currentNode = nextNode;
            }
        }

    }

    public void insertAfter(SingleLinkNode node, SingleLinkNode nextNode) {
        SingleLinkNode oldNextNode = node.getNext();
        node.setNext(nextNode);
        nextNode.setNext(oldNextNode);
    }

    public int getSize() {
        int size = 0;
        SingleLinkNode currentNode = this.head;
        while (currentNode != null) {
            currentNode = currentNode.getNext();
        }
        return size;
    }

    public void reverseList() {
        SingleLinkNode previousNode = null;
        SingleLinkNode currentNode = this.head;
        SingleLinkNode nextNode = null;
        while (currentNode != null) {
            // Stash the next node to pass into agin for the next loop!
            nextNode = currentNode.getNext();
            // Reverse by pointing to the previous node.
            currentNode.setNext(previousNode);
            // Set Previous to the current node so that reversion is complete.
            previousNode = currentNode;
            // Re-assign nextNode to continue loop!
            currentNode = nextNode;
        }
        this.head = previousNode;
    }


    public void prettyPrintList() {
        SingleLinkNode currentNode = this.head;
        while (currentNode != null) {
            if (currentNode.getNext() == null) {
                System.out.println("+----+------+");
                System.out.println("| " + currentNode.getData() + "  | null |");
                System.out.println("+----+------+");
            } else {
                System.out.println("+----+------+");
                System.out.println("| " + currentNode.getData() + "  |   o");
                System.out.println("+----+------+");
                System.out.println("         '");
                System.out.println(" --------'");
                System.out.println(" '");
                System.out.println(" '");
                System.out.println(" v");
            }

            currentNode = currentNode.getNext();
        }

    }

}
