package agh.ii.prinjava.proj1.impl;

public class MyQueueDLLBImpl<E> implements MyQueue<E> {
    private DLinkList<E> elems = new DLinkList<>();

    /**
     * this method adds the element given in parameter to the queue
     * @param x
     */
    @Override
    public void enqueue(E x) {
        elems.addFirst(x);
    }

    /**
     * this method removes and returns the first element added to the queue
     * (here, it removes the last element of the linked list MyQueue)
     * @return E
     */
    @Override
    public E dequeue() {
        return elems.removeLast();
    }

    /**
     * this method  returns the number of elements the queue has
     * @return int
     */
    @Override
    public int numOfElems() {
        return elems.getNumOfElems();
    }

    /**
     * this method returns the last element added to the queue (the first element of the linked list)
     * @return E
     */
    @Override
    public E peek() {
        return elems.getLastElem();
    }

    /**
     * this method returns a string with all the elements of the Queue
     * @return String
     */
    @Override
    public String toString() {
        return elems.toString();
    }
}
