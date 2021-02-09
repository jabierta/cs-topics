package src.linkedlist;

public class DoubleLinkNode {
    private Integer data;
    private DoubleLinkNode nextNode;
    private DoubleLinkNode prevNode;

    public DoubleLinkNode(Integer data) {
        this.setData(data);
    }

    public Integer getData() {
        return data;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    public DoubleLinkNode getPrevNode() {
        return prevNode;
    }

    public void setPrevNode(DoubleLinkNode prevNode) {
        this.prevNode = prevNode;
    }

    public DoubleLinkNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(DoubleLinkNode nextNode) {
        this.nextNode = nextNode;
    }
}
