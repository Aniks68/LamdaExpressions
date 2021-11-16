package com.company.doublylinkedlist;

public class Link {
    private int data;
    Link previous;
    Link next;

    public Link (int data) {
        previous = null;
        this.data = data;
        next = null;
    }

    public Link(Link previous, int data, Link next) {
        this.previous = previous;
        this.data = data;
        this.next = next;
    }

    public int Data() {
        return data;
    }
}
