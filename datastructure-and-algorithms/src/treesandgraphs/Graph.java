package src.treesandgraphs;

public interface Graph {
    void init(int n);

    int numVertices();

    int numEdges();

    Object getValue(int vertex, Object value);

    // method that assigns a value to the vertex
    void setValue(int vertex, Object value);

    void addEdge(int vertex1, int vertex2, int weight);

    int getWeight(int vertex1, int vertex2);

    void removeEdge(int vertex1, int vertex2);

    boolean isConnected(int vertex1, int vertex2);

    int[] neighbors(int vertex);
}
