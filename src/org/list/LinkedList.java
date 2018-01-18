package org.list;


class Node {
    int valueInserted;
    Node next;
}

public class LinkedList {

    private Node head;

    public LinkedList() {
        head = null;
    }


    public int getSize() {
        return numberOfElements;
    }

    public void insertFront(int value) {
        Node node = new Node();
        if (head != null){
            node.next = head;
        }
        head = node;
        node.valueInserted = value;
        numberOfElements ++;
    }


    public int getHead() {
        return head.valueInserted;
    }


    public int countOf(int value) {
        Node nodeToInspect = head;
        int count = 0;
        while(nodeToInspect != null){
            if(nodeToInspect.valueInserted == value){
                count ++;
            }
            nodeToInspect = nodeToInspect.next;
        }
        return count;
    }

    public void removeAt(int position) {
        if (head == null){
            return;
        }
        Node temp = head;
        if (position == 0){
            head = temp.next;
            numberOfElements --;
            return;
        }
        for (int i = 0; temp != null && i<position-1; i++) {
            temp = temp.next;

        }
            if (temp == null || temp.next == null) {
                return;
            }
            Node next = temp.next.next;
            temp.next = next;
            numberOfElements --;
    }

    private int numberOfElements = 0;

    public void addAtPosition(int position, int value) {
        Node temp = head;
        if (head == null){
            return;
        }
        if (position == 0){
            Node newNode = new Node();
            newNode.valueInserted = value;
            newNode.next = head;
            head = newNode;
            numberOfElements ++;
            return;
        }
        for (int i = 0; temp != null && i<position; i++){
            if (i == position -1) {
                Node newNode = new Node();
                newNode.valueInserted = value;
                newNode.next = temp.next;
                temp.next = newNode;
                numberOfElements++;
            }
            temp = temp.next;
        }

    }
}
