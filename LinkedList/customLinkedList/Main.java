package LinkedList.customLinkedList;

import LinkedList.customLinkedList.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.insertFirst(18);
        list.insertFirst(20);
        list.insertFirst(12);
        list.insertFirst(6);
        list.insertFirst(5);
        list.insertLast(99);
        list.insert(100, 3);
        list.display();
    }
}
