package src.treesandgraphs;

public class BinarySearchTree {
    public void run() {
        Node rootNode = new Node(10);
        // Randomly generate data and insert
        rootNode.insert(5);
        rootNode.insert(15);
        System.out.print("Pre Order: ");
        rootNode.printPreOrder();
        System.out.print("\nIn Order: ");
        rootNode.printInOrder();
        System.out.print("\nPost Order: ");
        rootNode.printPostOrder();

    }

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
        private Node search(int value) {
            if (this.data == value) {
                return this;
            }

            if (this.getData() < value) {
                if (this.getLeftNode() != null) {
                    return this.leftNode.search(value);
                } else {
                    return null;
                }
            } else {
                if (this.getRightNode() != null) {
                    return this.rightNode.search(value);
                } else {
                    return null;
                }
            }

        }

        // Insert
        private void insert(int value) {
            if (value <= this.data) {
                if (this.leftNode == null) {
                    this.leftNode = new Node(value);
                } else {
                    this.leftNode.insert(value);
                }
            } else {
                if (this.rightNode == null) {
                    this.rightNode = new Node(value);
                } else {
                    this.rightNode.insert(value);
                }
            }
        }

        // Traversal complexity is O(n)
        // 10
        // 5 15
        // Pre-order Traversal: 10 5 15
        // In-order Traversal: 5 10 15
        // Post-order Traversal: 5 15 10

        public void printPreOrder() {
            System.out.print(this.data + " ");

            if (leftNode != null) {
                leftNode.printPreOrder();
            }


            if (rightNode != null) {
                rightNode.printPreOrder();
            }
        }

        public void printInOrder() {
            if (this.leftNode != null) {
                this.leftNode.printInOrder();
            }

            System.out.print(this.data + " ");

            if (this.rightNode != null) {
                this.rightNode.printInOrder();
            }
        }

        public void printPostOrder() {
            if (this.rightNode != null) {
                this.rightNode.printInOrder();
            }

            if (this.leftNode != null) {
                this.leftNode.printInOrder();
            }

            System.out.print(this.data + " ");
        }

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
