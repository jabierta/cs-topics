package src.treesandgraphs;

public class GraphAdjacencyList implements Graph {
    // To make sense of this try and remember adjacent list
    /** 
     * Graph: 
     *           4        
     *          /\         
     *         0  2
     *        /    \
     *       1 ---  3
     * **/ 
    // null <- [0] <-> [1] <-> [4] 
    // null <- [1] ->
    // null <- [2] ->
    // null <- [3] ->
    // null <- [4] ->
    private Edge[] nodeArray;
    private Object[] nodeValues;
    private int numEdges;

    @Override
    public void init(int numberOfNodes) {
        nodeArray = new Edge[numberOfNodes];
        for (int i = 0; i < numberOfNodes; i++) {
            nodeArray[i] = new Edge(-1, -1, null, null);
        }
        nodeValues = new Object[numberOfNodes];
        numEdges = 0;
    }

    @Override
    public int numVertices() {
        return nodeArray.length;
    }

    @Override
    public int numEdges() {
        return numEdges;
    }

    @Override
    public Object getValue(int vertex, Object value) {
        return nodeValues[vertex];
    }

    @Override
    public void setValue(int vertex, Object value) {
        nodeValues[vertex] = value;
    }

    private Edge find(int vertex1, int vertex2) {
        Edge currentEdge = nodeArray[vertex1];
        while ((currentEdge.getNext() != null) && (currentEdge.getNext().getVertex() < vertex2)) {
            currentEdge = currentEdge.getNext();
        }
        return currentEdge;
    }

    @Override
    public int getWeight(int vertex1, int vertex2) {
        Edge currentEdge = find(vertex1, vertex2);
        if (currentEdge.getNext() == null || currentEdge.getNext().getVertex() != vertex2) {
            return 0;
        } else {
            return currentEdge.getNext().getWeight();
        }
    }

    @Override
    public void addEdge(int vertex1, int vertex2, int weight) {
        if (weight == 0) {
            return;
        }

        Edge currentEdge = find(vertex1, vertex2);
        if (currentEdge.getNext() != null && currentEdge.getNext().getVertex() == vertex2) {
            currentEdge.getNext().setWeight(weight);
        } else {
            currentEdge.setNext(new Edge(vertex2, weight, currentEdge, currentEdge.getNext()));
        }
        numEdges++;
    }


    @Override
    public void removeEdge(int vertex1, int vertex2) {
        Edge currentEdge = find(vertex1, vertex2);
        if (currentEdge.getNext() == null || currentEdge.getNext().getVertex() != vertex2) {
            return;
        } else {
            currentEdge.setNext(currentEdge.getNext().getNext());
            if (currentEdge != null) {
                currentEdge.getNext().setPrev(currentEdge);
            }
        }
        numEdges--;

    }

    @Override
    public boolean isConnected(int vertex1, int vertex2) {
        if (this.getWeight(vertex1, vertex2) != 0) {
            return true;
        }
        return false;
    }

    @Override
    public int[] neighbors(int vertex) {
        int edgeCount = 0;
        for (Edge currentEdge = nodeArray[vertex].getNext(); currentEdge
                .getNext() != null; currentEdge = currentEdge.getNext()) {
            edgeCount++;
        }

        int[] neighbors = new int[edgeCount];
        edgeCount = 0;
        for (Edge currentEdge = nodeArray[vertex].getNext(); currentEdge
                .getNext() != null; currentEdge = currentEdge.getNext()) {
            neighbors[edgeCount] = currentEdge.getVertex();
            edgeCount++;
        }

        return null;
    }
}
