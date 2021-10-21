package agh.ii.prinjava.proj1.impl;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DLinkListTest {
    DLinkList<Integer> dLinkList = new DLinkList<>();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    /**
     * this method tests the addFirst() method
     */
    @Test
    void addFirst() {
        dLinkList.addFirst(5);
        dLinkList.addFirst(6);
        dLinkList.addFirst(7);
        dLinkList.addFirst(8);
        assertEquals("DLinkList{ 8 7 6 5 }", dLinkList.toString());
    }

    /**
     * this method tests the addLast() method
     */
    @Test
    void addLast() {
        dLinkList.addLast(5);
        dLinkList.addLast(6);
        dLinkList.addLast(7);
        dLinkList.addLast(8);
        assertEquals("DLinkList{ 5 6 7 8 }", dLinkList.toString());
    }

    /**
     * this method tests the removeFirst() method
     */
    @Test
    void removeFirst() {
        addFirst();
        assertEquals("DLinkList{ 8 7 6 5 }", dLinkList.toString());
        assertEquals(8,dLinkList.removeFirst());
        assertEquals("DLinkList{ 7 6 5 }", dLinkList.toString());
        assertEquals(7,dLinkList.removeFirst());
        assertEquals(6,dLinkList.removeFirst());
        assertEquals(5,dLinkList.removeFirst());
        assertEquals("DLinkList{ }", dLinkList.toString());
    }

    /**
     * this method tests the removeLast() method
     */
    @Test
    void removeLast() {
        addLast();
        assertEquals("DLinkList{ 5 6 7 8 }", dLinkList.toString());
        assertEquals(8,dLinkList.removeLast());
        assertEquals("DLinkList{ 5 6 7 }", dLinkList.toString());
        assertEquals(7,dLinkList.removeLast());
        assertEquals(6,dLinkList.removeLast());
        assertEquals(5,dLinkList.removeLast());
        assertEquals("DLinkList{ }", dLinkList.toString());
    }

    /**
     * this method tests the overridden toString() method
     */
    @Test
    void toStringTest() {
        assertEquals("DLinkList{ }", dLinkList.toString());
        dLinkList.addLast(5);
        dLinkList.addLast(6);
        dLinkList.addLast(7);
        assertEquals("DLinkList{ 5 6 7 }", dLinkList.toString());
        dLinkList.addFirst(7);
        dLinkList.addFirst(8);
        assertEquals("DLinkList{ 8 7 5 6 7 }", dLinkList.toString());
    }

    /**
     * this method tests the getFirstElem() method
     */
    @Test
    void getFirstElem() {
        addLast(); //DLinkList{ 5 6 7 8 }
        assertEquals(5, dLinkList.getFirstElem());
    }

    /**
     * this method tests the getLastElem() method
     */
    @Test
    void getLastElem() {
        addLast(); //DLinkList{ 5 6 7 8 }
        assertEquals(8, dLinkList.getLastElem());
    }

    /**
     * this method tests the getNumOfElems() method
     */
    @Test
    void getNumOfElems() {
        assertEquals(0, dLinkList.getNumOfElems());
        addLast(); //DLinkList{ 5 6 7 8 }
        assertEquals(4, dLinkList.getNumOfElems());
    }
}