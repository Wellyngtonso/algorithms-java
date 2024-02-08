package datastructures.doublylinkedlist;

public class Main {

    public static void main(String[] args) {

        DoublyLinkedList myDLL = new DoublyLinkedList(1);

        myDLL.append(2);
        myDLL.append(3);
        myDLL.append(4);
        myDLL.append(5);
        myDLL.append(6);
        myDLL.append(7);
        myDLL.append(8);
        myDLL.append(9);
        myDLL.append(10);

        myDLL.insert(5, 9);

        myDLL.remove(5);

        myDLL.printList();

        System.out.println(myDLL.get(5).value);
    }
}
