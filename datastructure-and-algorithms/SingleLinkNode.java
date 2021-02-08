public class SingleLinkNode {
    private Integer data;
    private SingleLinkNode next;

    public SingleLinkNode(Integer data) {
        this.data = data;
        this.next = null;
    }

    public Integer getData() {
        return this.data;
    }

    public SingleLinkNode getNext() {
        return this.next;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    public void setNext(SingleLinkNode next) {
        this.next = next;
    }
}
