package src.treesandgraphs;

public class BinarySearchTree {

    // BST is a tree where all the nodes on the left sub tree is less than the root node
    // and the right sub tree is more than the value of root node
    class Node {
        private Node leftNode;
        private Node rightNode;
        private int data;

        Node(int data) {
            this.data = data;
        }

        // Search
        // Will return the first occurrence where node.getData == data
        // Returns null if not found;
        //
        private Node search(int data) {
            if (this.data == data) {
                return this;
            }

            if (this.getData() < data) {
                if (this.getLeftNode() != null) {
                    return this.leftNode.search(data);
                } else {
                    return null;
                }
            } else {
                if (this.getRightNode() != null) {
                    return this.rightNode.search(data);
                } else {
                    return null;
                }
            }

        }

        // Insert
        private void insert(int data) {
            if (data <= this.data) {
                if (this.leftNode == null) {
                    this.leftNode = new Node(data);
                } else {
                    this.leftNode.insert(data);
                }
            } else {
                if (this.rightNode == null) {
                    this.rightNode = new Node(data);
                } else {
                    this.rightNode.insert(data);
                }
            }
        }


        // Pre-order Traversal
        // In-order Traversal
        // Post-order Traversal


        // Getters and Setters
        public Node getLeftNode() {
            return leftNode;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getRightNode() {
            return rightNode;
        }

        public void setRightNode(Node rightNode) {
            this.rightNode = rightNode;
        }

        public void setLeftNode(Node leftNode) {
            this.leftNode = leftNode;
        }
    }
}
