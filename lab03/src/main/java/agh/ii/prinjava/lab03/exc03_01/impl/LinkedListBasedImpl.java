package agh.ii.prinjava.lab03.exc03_01.impl;

import agh.ii.prinjava.lab03.exc03_01.QueueOfInts;

public class LinkedListBasedImpl implements QueueOfInts {

    @Override
    public void enqueue(int x) {
        Node node1 = new Node(x, first, null);
        if (numOfElems == 0){
            last = node1;
        }
        first = node1;
        numOfElems++;
    }

    @Override
    public int dequeue() {
        if(numOfElems != 0){
            int uwu = last.elem;
            last = last.prev;
            last.next = null;
            numOfElems--;
            return uwu;
        }
        throw new IllegalStateException("Fail : Queue empty");
    }

    @Override
    public int numOfElems() {
        return numOfElems;
    }

    @Override
    public int peek() {
        if (numOfElems != 0){
            return last.elem;
        }
        throw new IllegalStateException("Fail : Queue empty");
        );
    }

    private static class Node {
        int elem;
        Node next;
        Node prev;

        public Node(int elem, Node next, Node prev) {
            this.elem = elem;
            this.next = next;
            this.prev = prev;
        }
    }

    private Node first = null;
    private Node last = null;

    private int numOfElems = 0;
}
