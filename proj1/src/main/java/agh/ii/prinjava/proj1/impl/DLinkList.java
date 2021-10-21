package agh.ii.prinjava.proj1.impl;

public class DLinkList<E> {
    // ...
    private static class Node<T> {
        T elem;
        Node<T> next;
        Node<T> prev;
    }

    private Node<E> first = null;
    private Node<E> last = null;
    private int numOfElems = 0;

    /**
     * returns the first element of the linked list
     * @return E
     */
    public E getFirstElem() {
        if (numOfElems > 0){
            return first.elem;
        }
        throw new RuntimeException("can't return, list is empty");
    }

    /**
     * returns the last element of the linked list
     * @return E
     */
    public E getLastElem() {
        if (numOfElems > 0) {
            return last.elem;
        }
        throw new RuntimeException("can't return, list is empty");
    }

    /**
     * returns the number of elements in the linked list
     * @return int
     */
    public int getNumOfElems() {
        return numOfElems;
    }

    /**
     * this method adds an element at the first position of the linked list
     * @param element
     */
    public void addFirst(E element) {
        Node<E> new_node = new Node<>();
        new_node.elem = element;
        if (numOfElems > 0){
            new_node.next = first;
            first.prev = new_node;
        }
        else {
            last = new_node;
        }
        first = new_node;
        numOfElems++;
    }

    /**
     * this method adds an element at the last position of the linked list
     * @param element
     */
    public void addLast(E element) {
        Node<E> new_node = new Node<>();
        new_node.elem = element;
        if (numOfElems > 0) {
            new_node.prev = last;
            last.next = new_node;
        }
        else {
            first = new_node;
        }
        last = new_node;
        numOfElems++;
    }

    /**
     * this method removes the element at the first position of the linked list
     * @return
     */
    public E removeFirst() {
        if (numOfElems > 0){
            E removed = first.elem;
            first = first.next;
            if (numOfElems > 1) {
                first.prev = null;
            }
            else {
                last = null;
            }
            numOfElems--;
            return removed;
        }
        throw new RuntimeException("can't return, list is empty");
    }

    /**
     * this method removes the element at the last position of the linked list
     * @return
     */
    public E removeLast() {
        if (numOfElems > 0){
            E removed = last.elem;
            last = last.prev;
            if (numOfElems > 1) {
                last.next = null;
            }
            else {
                first = null;
            }
            numOfElems--;
            return removed;
        }
        throw new RuntimeException("can't return, list is empty");
    }

    /**
     * this method returns a string of all the elements of the linked list
     * @return
     */
    @Override
    public String toString() {
        String toReturn = "DLinkList{ ";
        Node<E> temp = first;
        while (temp != null){
            toReturn += temp.elem.toString() + " ";
            temp = temp.next;
        }
        toReturn += "}";
        return toReturn;
    }
}