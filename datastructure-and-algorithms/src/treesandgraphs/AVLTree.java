package src.treesandgraphs;

public class AVLTree {
    // This is a self balancing BinarySearchTree


    class Node {
        private Node leftNode;
        private Node rightNode;
        private int data;
        private int balanceFactor;

        Node(int data) {
            this.data = data;
        }

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

        // Insert self balances
        private void insert(int value) {

        }

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

        public int getBalanceFactor() {
            return balanceFactor;
        }


        public void setBalanceFactor(int balanceFactor) {
            this.balanceFactor = balanceFactor;
        }

    }
}
