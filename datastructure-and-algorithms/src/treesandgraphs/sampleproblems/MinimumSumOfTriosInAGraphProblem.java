package src.treesandgraphs.sampleproblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class MinimumSumOfTriosInAGraphProblem {
    private HashMap<Integer, Node> nodes = new HashMap<Integer, Node>();

    public void buildGraph(int[] nodesFrom, int[] nodesTo) {
        for (int i = 0; i < nodesFrom.length; i++) {
            Node nodeFrom = nodes.get(nodesFrom[i]);
            Node nodeTo = nodes.get(nodesTo[i]);

            if (nodeFrom == null) {
                nodeFrom = new Node();
                nodeFrom.id = nodesFrom[i];
            }
            if (nodeTo == null) {
                nodeTo = new Node();
                nodeTo.id = nodesTo[i];
                nodes.put(nodeTo.id, nodeTo);
            }

            nodeFrom.adjacentNodes.add(nodeTo);
            nodes.put(nodeFrom.id, nodeFrom);
        }
    }

    public int getMinimumSumOfTrios(int totalNumNodes, int totalEdges, int[] nodesFrom,
            int[] nodesTo) {
        // catch some cases here!
        this.buildGraph(nodesFrom, nodesTo);

        List<List<Node>> trios = new ArrayList<>();
        // no trio -1

        // Math.min(findTrio)
        List<Integer> trioSum = new ArrayList<>();

        if (trios.isEmpty()) {
            return -1;
        }

        for(List<Nodes> nodes: trios) {
            for () {
                
            }

        minimumSumOfTrios.add(trios);
        }

        Collections.sort(trioSum);

        return trioSum.get(0);
    }


    class Node {
        int id;
        List<Node> adjacentNodes = new ArrayList<>();
    }
}
