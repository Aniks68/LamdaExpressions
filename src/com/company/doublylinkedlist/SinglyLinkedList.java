package com.company.doublylinkedlist;

public class SinglyLinkedList {
    Node head;

    public SinglyLinkedList() {
        this.head = null;
    }

    public void addRear(int data) {
        if (head.next == null) {
            head.next = new Node(data);
        } else {
            Node current = head;
            while(current.next != null) {
                current = current.next;
            }
            current.next = new Node(data);
        }
    }

    public void addHead ( int data) {
        if (head != null) {
            Node current = head;
            head = new Node(data);
            head.next = current;
        }
    }

    public void print() {
        Node current = head;
        while (current != null) {
            System.out.println(current.getData());
            current = current.next;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();

        sll.addHead(12);
        sll.addHead(21);
//        sll.addRear(32);
        sll.print();
    }
}




