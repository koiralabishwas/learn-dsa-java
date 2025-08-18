package dsa.partTwo.BinaryTrees;

public class Tree {
    private class Node {
        private int value; // private
        private Node leftChild; // private
        private Node rightChild; // private

        private Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node=" + this.value;
        }
    }

    public Node root;

    public void insert(int value) {
        var newNode = new Node(value);
        if (root == null) {
            root = newNode;
            return;
        }

        // TODO: make this recursive
        var current = this.root;
        while (true) { // infinite while loop
            if (value < current.value) {
                if (current.leftChild == null) {
                    current.leftChild = newNode;
                    break;
                }
                current = current.leftChild;
            } else {
                if (current.rightChild == null) {
                    current.rightChild = newNode;
                    break;
                }
                current = current.rightChild;
            }
        }
        if (value < current.value) {
            current.leftChild = new Node(value);
        }

        if (value > current.value) {
            current.rightChild = new Node(value);
        }
    }

    public boolean find(int value) {
        var current = this.root;
        while (current != null) {
            if (value < current.value) {
                current = current.leftChild;
            } else if (value > current.value) {
                current = current.rightChild;
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        var tree = new Tree();
        tree.insert(7);
        tree.insert(4);
        tree.insert(9);
        tree.insert(1);
        tree.insert(6);
        tree.insert(8);
        tree.insert(10);
        System.out.println(tree.find(4));
        System.out.println(tree.toString());

    }
}
