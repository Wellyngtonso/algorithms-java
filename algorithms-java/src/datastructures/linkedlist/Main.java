package datastructures.linkedlist;


public class Main {

    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);

        myLinkedList.append(7);
        myLinkedList.append(7);
        myLinkedList.append(7);
        myLinkedList.append(7);
        myLinkedList.append(7);

        myLinkedList.removeLast();

        myLinkedList.prepend(3);

        myLinkedList.removeFirst();

        myLinkedList.removeDuplicates();

        System.out.println("O index é: " + myLinkedList.get(2).value);

        myLinkedList.set(2, 3);

        myLinkedList.insert(2, 8);

        myLinkedList.remove(2);

        myLinkedList.append(4);
        myLinkedList.append(5);
        myLinkedList.append(6);

        myLinkedList.printList();

        System.out.println("");

        System.out.println("O meu elemento do meio é: " + myLinkedList.findMiddleNode().value);

        System.out.println("A minha lista tem loops? " + myLinkedList.hasLoop());

        myLinkedList.findKthFromEnd(3);
    }

}