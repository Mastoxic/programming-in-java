package agh.ii.prinjava.proj1.impl;

public class MyStackDLLBImpl<E> implements MyStack<E> {
    private DLinkList<E> elems = new DLinkList<>();

    /**
     * this method removes and returns the last element added to the stack
     * (here, it removes the first element of the linked list MyStack)
     * @return
     */
    @Override
    public E pop() {
        return elems.removeFirst();
    }

    /**
     * this method adds the element given in parameter to the stack
     * @param x
     */
    @Override
    public void push(E x) {
        elems.addFirst(x);
    }

    /**
     * this method returns the number of elements the stack has
     * @return int
     */
    @Override
    public int numOfElems() {
        return elems.getNumOfElems();
    }

    /**
     * this method returns the last element added to the stack (the first element of the linked list)
     * @return E
     */
    @Override
    public E peek() {
        return elems.getFirstElem();
    }

    /**
     * this method returns a string with all the elements of the Stack
     * @return String
     */
    @Override
    public String toString() {
        return elems.toString();
    }
}
