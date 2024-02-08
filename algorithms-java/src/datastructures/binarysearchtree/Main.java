package datastructures.binarysearchtree;

public class Main {

    public static void main(String[] args) {
        BinarySearchTree myBST = new BinarySearchTree();

        myBST.insert(12);
        myBST.insert(20);
        myBST.insert(13);
        myBST.insert(48);
        myBST.insert(11);
        myBST.insert(3);

        myBST.printTree();

        System.out.println("Contains: " + myBST.contains(11));
    }
}
