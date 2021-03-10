package src.treesandgraphs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class GraphNode {
    // This is a undirected graph represented through Node Objects
    private HashMap<Integer, Node> nodeLookup = new HashMap<Integer, Node>();

    class Node {
        private int id;
        // TODO Maybe we can use the LinkedList that we have in the project
        private LinkedList<Node> adjacent = new LinkedList<Node>();

        private Node(int id) {
            this.setId(id);
        }

        public LinkedList<Node> getAdjacent() {
            return adjacent;
        }

        public void setAdjacent(LinkedList<Node> adjacent) {
            this.adjacent = adjacent;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
    }

    private Node getNode(int id) {
        return this.nodeLookup.get(id);
    }

    public void addEdge(int source, int destination) {
        Node sourceNode = this.getNode(source);
        Node destinationNode = this.getNode(destination);
        sourceNode.adjacent.add(destinationNode);
    }


    // Depth First Search (DFS) is a search algorithm that traverses/searches through the graph/tree
    // The algorithm searches the whole depth of a given node before backtracking back to the node.
    // The depth first search
    // Implemented through a recursive algorithm keeping in mind that cycles can happen
    // PROS
    // CONS: and edge case where we ran away farther from the goal
    public boolean hasPathDFS(int source, int destination) {
        return hasPathDFS(this.getNode(source), this.getNode(destination), new HashSet<Integer>());
    }

    private boolean hasPathDFS(Node sourceNode, Node destinationNode, HashSet<Integer> visited) {
        // We already visited this node.
        if (visited.contains(sourceNode.getId())) {
            return false;
        }

        // since we are in this node we add it in
        visited.add(sourceNode.getId());

        // Should I use the id instead: sourceNode.getId() == destinationNode.getId()
        if (sourceNode == destinationNode) {
            return true;
        }

        for (Node nodeChild : sourceNode.getAdjacent()) {
            if (hasPathDFS(nodeChild, destinationNode, visited)) {
                return true;
            }
        }

        return false;
    }

    public boolean hasPathBFS(int source, int destination) {
        return hasPathBFS(this.getNode(source), this.getNode(destination));
    }

    // Breadth First Search BFS
    // Implemented using a queue
    public boolean hasPathBFS(Node source, Node destination) {
        LinkedList<Node> nextToVisit = new LinkedList<Node>();
        HashSet<Integer> visited = new HashSet<Integer>();
        nextToVisit.add(source);
        while (!nextToVisit.isEmpty()) {
            Node node = nextToVisit.remove();
            if (node == destination) {
                return true;
            }

            if (visited.contains(node.getId())) {
                continue;
            }

            visited.add(node.getId());

            for (Node child : node.getAdjacent()) {
                nextToVisit.add(child);
            }
        }
        return false;
    }

    public HashMap<Integer, Node> getNodeLookup() {
        return nodeLookup;
    }

    public void setNodeLookup(HashMap<Integer, Node> nodeLookup) {
        this.nodeLookup = nodeLookup;
    }
}
