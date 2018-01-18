package org.list;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class LinkedListTest {


    LinkedList linkedList;

    @Before
    public void before(){
        linkedList = new LinkedList();
    }

    @Test
    public void WhenCreated_LinkedListHasNoElements(){
        assertEquals(0, linkedList.getSize());
    }

    @Test
    public void canInsertFront(){
        linkedList.insertFront(42);
        assertEquals(1, linkedList.getSize());
        linkedList.insertFront(15);
        assertEquals(2, linkedList.getSize());
    }

    @Test
    public void canGetHead(){
        linkedList.insertFront(42);
        linkedList.insertFront(15);
        assertEquals(15, linkedList.getHead());
    }

    @Test
    public void canReturnCountOf(){
        linkedList.insertFront(42);
        linkedList.insertFront(42);
        linkedList.insertFront(15);
        assertEquals(2, linkedList.countOf(42));
    }

    @Test
    public void canRemoveAt() {
        linkedList.insertFront(42);
        linkedList.insertFront(44);
        linkedList.insertFront(15);
        linkedList.insertFront(26);
        linkedList.insertFront(35);
        linkedList.insertFront(19);
        assertEquals(6, linkedList.getSize());
        linkedList.removeAt(3);
        assertEquals(0, linkedList.countOf(15));
        assertEquals(5, linkedList.getSize());
    }

    @Test
    public void canAddAtPosition(){
        linkedList.insertFront(42);
        linkedList.insertFront(44);
        linkedList.insertFront(15);
        linkedList.insertFront(26);
        linkedList.insertFront(35);
        linkedList.insertFront(19);
        assertEquals(6, linkedList.getSize());
        linkedList.addAtPosition(2, 12);
        assertEquals(7, linkedList.getSize());

    }

}
