package datastructures.binarysearchtree;

public class BinarySearchTree {

    Node root;

    class Node {
        int value;
        Node left;
        Node right;

        private Node(int value) {
            this.value = value;
        }
    }

    public boolean insert(int value) {
        Node newNode = new Node(value);
        if(root == null) {
            root = newNode;
            return true;
        }

        Node temp = root;
        while(true) {
            if(newNode.value == temp.value) {
                return false;
            }
            if(newNode.value < temp.value) {
                if(temp.left == null) {
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            } else {
                if(temp.right == null) {
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }
        }
    }

    public void printTree() {
        if (root == null) {
            System.out.println("(empty tree)");
        } else {
            printTree(root, 0);
        }
    }

    private void printTree(Node node, int level) {
        if (node == null) {
            printWhitespaces(3 * level);
            System.out.println("null");
            return;
        }

        printTree(node.right, level + 1);
        printWhitespaces(3 * level);
        System.out.println(node.value);
        printTree(node.left, level + 1);
    }

    private void printWhitespaces(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(" ");
        }
    }

    public boolean contains(int value) {
        Node temp = root;
        while(temp != null) {
            if(value < temp.value) {
                temp = temp.left;
            } else if(value > temp.value) {
                temp = temp.right;
            } else {
                return true;
            }
        }

        return false;
    }
}
