package com.company.doublylinkedlist;


public class DoublyLinkedList {
    private Link head;
    private int size;

    public DoublyLinkedList() {
        head = null;
        size = 0;
    }

    public void addFront(int data) {
        if (head == null)
            head = new Link(null, data, null);
        else {
            Link newLink = new Link(null, data, head);
            head.previous = newLink;
            head = newLink;
        }
        size++;
    }

    public void addRear(int data) {
        if (head == null)
            head = new Link(null, data, null);
        else {
            Link current = head;
            while(current.next != null) {
                current = current.next;
            }
            Link newLink = new Link(current, data, null);
            current.next = newLink;
        }
        size++;
    }

    public void removeFront() {
        if (head == null) return;
        else if (head.next == null) {
            head = null;
            System.out.println("No node from front");
        }
        else {
            head = head.next;
            head.previous = null;
        }
    }

    public void removeEnd() {
        if(head == null) return;
        else if (head.next == null) {
            head = null;
            System.out.println("No node from end");
        }
        else {
            Link current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.previous.next = null;
        }
        size--;
    }

    public int size() {
        return size;
    }

    public void print() {
        Link current = head;
        while (current != null) {
            System.out.println(current.Data());
            current = current.next;
        }
    }

    public boolean isEmpty() {
        return head == null;
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.addFront(5);
        dll.addFront(10);
        dll.print();
        System.out.println("==================");
        dll.addRear(36);
        dll.addRear(27);
        dll.print();
        System.out.println("==================");
        dll.removeFront();
        dll.print();
        System.out.println("==================");
        dll.removeEnd();
        dll.print();
        System.out.println("==================");
        dll.removeEnd();
        dll.print();
        System.out.println("==================");
        dll.removeFront();
        dll.print();
    }
}
