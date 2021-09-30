package agh.ii.prinjava.lab02.exc02_01.impl;

import agh.ii.prinjava.lab02.exc02_01.StackOfInts;

public class LinkedListBasedImpl implements StackOfInts {

    @Override
    public int pop() {
        if(numOfElems != 0){
            int uwu = node.elem;
            node = node.next;
            return uwu;
        }

        throw new IllegalStateException("list is empty");
    }

    @Override
    public void push(int x) {
        Node node1 = new Node(x);
        if (numOfElems != 0){
            node1.next = node;
        }
        node = node1;
        numOfElems++;
        throw new IllegalStateException("list is empty");
    }

    @Override
    public int numOfElems() {
        return numOfElems;
    }

    @Override
    public int peek() {
        if (numOfElems != 0){
            return node.elem;
        }
        throw new IllegalStateException("list is empty");
    }

    private static class Node {
        int elem;
        Node next;

        public Node(int elem) {
            this.elem = elem;
        }
    }

    private int numOfElems = 0;
    private Node node;
}
