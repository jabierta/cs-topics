package src.treesandgraphs;

public class Edge {
    private int vertex;
    private int weight;
    private Edge prev;
    private Edge next;

    // Basically a double linked list

    public Edge(int vertex, int weight, Edge prev, Edge next) {
        this.setVertex(vertex);
        this.setWeight(weight);
        this.setPrev(prev);
        this.setNext(next);
    }

    public Edge getNext() {
        return next;
    }

    public void setNext(Edge next) {
        this.next = next;
    }

    public Edge getPrev() {
        return prev;
    }

    public void setPrev(Edge prev) {
        this.prev = prev;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getVertex() {
        return vertex;
    }

    public void setVertex(int vertex) {
        this.vertex = vertex;
    }
}

